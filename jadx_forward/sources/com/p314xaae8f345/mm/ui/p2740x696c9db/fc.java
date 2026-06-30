package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class fc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f291955d;

    public fc(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72) {
        this.f291955d = activityC22543x95896a72;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = this.f291955d;
        if (activityC22543x95896a72.isFinishing() || activityC22543x95896a72.isDestroyed()) {
            return;
        }
        int mo69307x9746038c = activityC22543x95896a72.f291771z.mo69307x9746038c() / 1000;
        if (activityC22543x95896a72.B.m69282xd98b9220() != mo69307x9746038c) {
            activityC22543x95896a72.B.a(mo69307x9746038c);
        }
        activityC22543x95896a72.E.mo50297x7c4d7ca2(activityC22543x95896a72.G, java.lang.Math.min(1000 - (activityC22543x95896a72.f291771z.mo69307x9746038c() % 1000), 500L));
    }
}
