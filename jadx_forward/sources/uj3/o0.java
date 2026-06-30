package uj3;

/* loaded from: classes14.dex */
public final class o0 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.v0 f509867d;

    public o0(uj3.v0 v0Var) {
        this.f509867d = v0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        uj3.v0 v0Var = this.f509867d;
        uj3.k1 m168149x29665661 = v0Var.m168149x29665661();
        if (m168149x29665661 == null) {
            return;
        }
        uj3.k1 m168149x296656612 = v0Var.m168149x29665661();
        int i17 = m168149x296656612 != null ? m168149x296656612.f509843f : 0;
        v0Var.getClass();
        m168149x29665661.f509843f = (i17 + 0) / 2;
    }
}
