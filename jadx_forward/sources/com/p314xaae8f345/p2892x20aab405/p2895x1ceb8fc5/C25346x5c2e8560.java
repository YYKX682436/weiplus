package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.PlayerStateRunner */
/* loaded from: classes13.dex */
class C25346x5c2e8560 {
    private static final java.lang.String TAG = "StateRunner";

    /* renamed from: mState */
    private java.lang.Integer f45710xbec81024;

    /* renamed from: mLock */
    private final java.util.concurrent.locks.ReadWriteLock f45709x6243b38 = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: mAudioTrack */
    private java.lang.ref.WeakReference<android.media.AudioTrack> f45708x37ef5362 = new java.lang.ref.WeakReference<>(null);

    public C25346x5c2e8560(java.lang.Integer num) {
        this.f45710xbec81024 = num;
    }

    public java.lang.Integer get() {
        this.f45709x6243b38.readLock().lock();
        try {
            int intValue = this.f45710xbec81024.intValue();
            android.media.AudioTrack audioTrack = this.f45708x37ef5362.get();
            if (audioTrack != null) {
                int playState = audioTrack.getPlayState();
                if (playState == 2) {
                    intValue = 5;
                } else if (playState == 3) {
                    intValue = 4;
                }
                if (!this.f45710xbec81024.equals(java.lang.Integer.valueOf(intValue))) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "!mState.equals(state), mstate = " + this.f45710xbec81024.toString() + "   state = " + intValue);
                }
            }
            return java.lang.Integer.valueOf(intValue);
        } finally {
            this.f45709x6243b38.readLock().unlock();
        }
    }

    /* renamed from: isEqual */
    public boolean m93850x7aad142a(java.lang.Integer... numArr) {
        this.f45709x6243b38.readLock().lock();
        try {
            for (java.lang.Integer num : numArr) {
                if (this.f45710xbec81024.equals(num)) {
                    this.f45709x6243b38.readLock().unlock();
                    return true;
                }
            }
            return false;
        } finally {
            this.f45709x6243b38.readLock().unlock();
        }
    }

    /* renamed from: setAudioTrack */
    public void m93851x78226117(android.media.AudioTrack audioTrack) {
        this.f45708x37ef5362 = new java.lang.ref.WeakReference<>(audioTrack);
    }

    /* renamed from: transfer */
    public java.lang.Integer m93852x4c58b7eb(java.lang.Integer num) {
        this.f45709x6243b38.writeLock().lock();
        try {
            java.lang.Integer num2 = this.f45710xbec81024;
            this.f45710xbec81024 = num;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, num2.toString() + " -> " + this.f45710xbec81024.toString());
            return num2;
        } finally {
            this.f45709x6243b38.writeLock().unlock();
        }
    }

    /* renamed from: transfer */
    public boolean m93853x4c58b7eb(java.lang.Integer num, java.lang.Integer... numArr) {
        this.f45709x6243b38.writeLock().lock();
        try {
            if (!m93850x7aad142a(numArr)) {
                this.f45709x6243b38.writeLock().unlock();
                return false;
            }
            m93852x4c58b7eb(num);
            this.f45709x6243b38.writeLock().unlock();
            return true;
        } catch (java.lang.Throwable th6) {
            this.f45709x6243b38.writeLock().unlock();
            throw th6;
        }
    }
}
