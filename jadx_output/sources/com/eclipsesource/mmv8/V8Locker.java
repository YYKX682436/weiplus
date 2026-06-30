package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public class V8Locker {
    private com.eclipsesource.mmv8.V8 runtime;
    private java.lang.Thread thread = null;
    private boolean released = false;

    public V8Locker(com.eclipsesource.mmv8.V8 v86) {
        this.runtime = v86;
        acquire();
    }

    public synchronized void acquire() {
        java.lang.Thread thread = this.thread;
        if (thread != null && thread != java.lang.Thread.currentThread()) {
            throw new java.lang.Error("Invalid V8 thread access: current thread is " + java.lang.Thread.currentThread() + " while the locker has thread " + this.thread);
        }
        if (this.thread == java.lang.Thread.currentThread()) {
            return;
        }
        com.eclipsesource.mmv8.V8 v86 = this.runtime;
        v86.acquireLock(v86.getV8RuntimePtr());
        this.thread = java.lang.Thread.currentThread();
        this.released = false;
    }

    public void checkThread() {
        if (this.released && this.thread == null) {
            throw new java.lang.Error("Invalid V8 thread access: the locker has been released!");
        }
        if (this.thread == java.lang.Thread.currentThread()) {
            return;
        }
        throw new java.lang.Error("Invalid V8 thread access: current thread is " + java.lang.Thread.currentThread() + " while the locker has thread " + this.thread);
    }

    public java.lang.Thread getThread() {
        return this.thread;
    }

    public boolean hasLock() {
        return this.thread == java.lang.Thread.currentThread();
    }

    public synchronized void release() {
        if ((this.released && this.thread == null) || this.runtime.isReleased()) {
            return;
        }
        checkThread();
        com.eclipsesource.mmv8.V8 v86 = this.runtime;
        v86.releaseLock(v86.getV8RuntimePtr());
        this.thread = null;
        this.released = true;
    }

    public synchronized boolean tryAcquire() {
        java.lang.Thread thread = this.thread;
        if (thread != null && thread != java.lang.Thread.currentThread()) {
            return false;
        }
        if (this.thread == java.lang.Thread.currentThread()) {
            return true;
        }
        com.eclipsesource.mmv8.V8 v86 = this.runtime;
        v86.acquireLock(v86.getV8RuntimePtr());
        this.thread = java.lang.Thread.currentThread();
        this.released = false;
        return true;
    }
}
