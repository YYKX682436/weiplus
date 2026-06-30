package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f145727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.i f145728e;

    public h(com.p314xaae8f345.mm.p648x55baa833.ui.i iVar, java.util.List list) {
        this.f145728e = iVar;
        this.f145727d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.i iVar = this.f145728e;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f5 = iVar.f145748d;
        if (activityC10332x8a1129f5.C <= 1) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC10332x8a1129f5.f145226h).m("del_selector_btn", true);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = iVar.f145748d.f145234s;
            c19662x4f7a67f3.T(true);
            c19662x4f7a67f3.V(false);
            c19662x4f7a67f3.Y(false);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = activityC10332x8a1129f5.f145234s;
            c19662x4f7a67f32.T(true);
            c19662x4f7a67f32.V(iVar.f145748d.p7());
            c19662x4f7a67f32.Y(false);
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10332x8a1129f5 activityC10332x8a1129f52 = iVar.f145748d;
        activityC10332x8a1129f52.f145234s.O(activityC10332x8a1129f52.A, this.f145727d, activityC10332x8a1129f52.f145229n);
        iVar.f145748d.f145234s.W(true);
    }
}
