package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class y1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 f230982d;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var) {
        this.f230982d = a2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = this.f230982d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4 c19745xad58a1a4 = a2Var.f230805h;
        if (c19745xad58a1a4 != null && c19745xad58a1a4.mo69311xc00617a4()) {
            if (a2Var.f230802e <= 0 || a2Var.f230805h.mo69307x9746038c() < a2Var.f230802e) {
                a2Var.f230798a.m66914xbf54e136(a2Var.f230805h.mo69307x9746038c() / a2Var.f230800c);
            } else {
                a2Var.f230805h.a(a2Var.f230801d, true);
                a2Var.f230798a.m66914xbf54e136(a2Var.f230801d / a2Var.f230800c);
            }
        }
        return true;
    }
}
