package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class f5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 f184870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 f184871e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176) {
        super(1);
        this.f184870d = q6Var;
        this.f184871e = c15258xcd50c176;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent ev6 = (android.view.MotionEvent) obj;
        boolean z17 = true;
        if (ev6 != null && ev6.getAction() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var = this.f184870d;
            if (q6Var.f185873e.l0()) {
                q6Var.f185873e.B0(false);
                return java.lang.Boolean.valueOf(z17);
            }
        }
        if (ev6 != null && ev6.getAction() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = this.f184871e;
            c15258xcd50c176.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
            c15258xcd50c176.m61719xd4a087b5().getHitRect(new android.graphics.Rect());
            int[] iArr = new int[2];
            c15258xcd50c176.m61719xd4a087b5().getLocationOnScreen(iArr);
            int i17 = iArr[0];
            android.graphics.Rect rect = c15258xcd50c176.f212428t;
            if (new android.graphics.Rect(i17 - rect.left, iArr[1] - rect.top, i17 + c15258xcd50c176.m61719xd4a087b5().getWidth() + c15258xcd50c176.f212428t.right, iArr[1] + c15258xcd50c176.m61719xd4a087b5().getHeight() + c15258xcd50c176.f212428t.bottom).contains((int) ev6.getRawX(), (int) ev6.getRawY())) {
                c15258xcd50c176.m61719xd4a087b5().performClick();
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
