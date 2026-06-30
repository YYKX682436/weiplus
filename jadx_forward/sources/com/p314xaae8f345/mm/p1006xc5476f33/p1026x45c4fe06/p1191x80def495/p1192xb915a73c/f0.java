package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "Lcom/tencent/mm/ipcinvoker/r;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class f0<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.f0();
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        sh1.g b17;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt(dm.i4.f66865x76d1ec5a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.C12594xd730ff56 c12594xd730ff56 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.C12594xd730ff56) bundle.getParcelable("motion_event");
        java.util.Objects.toString(c12594xd730ff56);
        if (c12594xd730ff56 == null || (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0.f170435a.b(i17)) == null) {
            return;
        }
        java.util.List list = c12594xd730ff56.f170417g;
        int size = list.size();
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[size];
        for (int i18 = 0; i18 < size; i18++) {
            android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
            pointerProperties.id = ((java.lang.Number) list.get(i18)).intValue();
            pointerProperties.toolType = 1;
            pointerPropertiesArr[i18] = pointerProperties;
        }
        java.util.List list2 = c12594xd730ff56.f170418h;
        int size2 = list2.size();
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[size2];
        for (int i19 = 0; i19 < size2; i19++) {
            android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
            pointerCoords.x = ((java.lang.Number) list2.get(i19)).floatValue();
            pointerCoords.y = ((java.lang.Number) c12594xd730ff56.f170419i.get(i19)).floatValue();
            pointerCoordsArr[i19] = pointerCoords;
        }
        long j17 = c12594xd730ff56.f170416f;
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(j17, j17, c12594xd730ff56.f170414d, list.size(), pointerPropertiesArr, pointerCoordsArr, 0, 0, 1.0f, 1.0f, 0, 0, 0, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
        b17.mo45013x667eb1da(obtain);
    }
}
