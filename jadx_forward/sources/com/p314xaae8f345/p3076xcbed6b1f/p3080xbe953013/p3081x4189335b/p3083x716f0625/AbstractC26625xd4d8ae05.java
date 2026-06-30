package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625;

/* renamed from: com.tencent.tinker.loader.hotplug.interceptor.Interceptor */
/* loaded from: classes13.dex */
public abstract class AbstractC26625xd4d8ae05<T_TARGET> {
    private static final java.lang.String TAG = "Tinker.Interceptor";

    /* renamed from: mTarget */
    private T_TARGET f55592x1aea985e = null;

    /* renamed from: mInstalled */
    private volatile boolean f55591x7c72818d = false;

    /* renamed from: com.tencent.tinker.loader.hotplug.interceptor.Interceptor$ITinkerHotplugProxy */
    /* loaded from: classes13.dex */
    public interface ITinkerHotplugProxy {
    }

    /* renamed from: decorate */
    public T_TARGET mo104597x220c2b0d(T_TARGET t_target) {
        return t_target;
    }

    /* renamed from: fetchTarget */
    public abstract T_TARGET mo104598x219af0eb();

    /* renamed from: inject */
    public abstract void mo104599xb96ca991(T_TARGET t_target);

    /* renamed from: install */
    public synchronized void m104600x74ae259b() {
        try {
            T_TARGET mo104598x219af0eb = mo104598x219af0eb();
            this.f55592x1aea985e = mo104598x219af0eb;
            T_TARGET mo104597x220c2b0d = mo104597x220c2b0d(mo104598x219af0eb);
            if (mo104597x220c2b0d != mo104598x219af0eb) {
                mo104599xb96ca991(mo104597x220c2b0d);
            } else {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "target: " + mo104598x219af0eb + " was already hooked.", new java.lang.Object[0]);
            }
            this.f55591x7c72818d = true;
        } catch (java.lang.Throwable th6) {
            this.f55592x1aea985e = null;
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26624x9c04af90(th6);
        }
    }

    /* renamed from: uninstall */
    public synchronized void m104601xdab628e2() {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26624x9c04af90 c26624x9c04af90;
        if (this.f55591x7c72818d) {
            try {
                mo104599xb96ca991(this.f55592x1aea985e);
                this.f55592x1aea985e = null;
                this.f55591x7c72818d = false;
            } finally {
            }
        }
    }
}
