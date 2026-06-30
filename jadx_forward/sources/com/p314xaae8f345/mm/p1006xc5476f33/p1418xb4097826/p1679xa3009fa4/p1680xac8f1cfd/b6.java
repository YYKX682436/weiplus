package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f215372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 f215373e;

    public b6(android.widget.EditText editText, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647) {
        this.f215372d = editText;
        this.f215373e = c15442xfd56d647;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.EditText editText = this.f215372d;
        editText.requestFocus();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647 = this.f215373e;
        if (c15442xfd56d647.m158354x19263085().hasWindowFocus()) {
            c15442xfd56d647.k7();
        } else {
            editText.getViewTreeObserver().removeOnWindowFocusChangeListener(c15442xfd56d647.f215045y);
            editText.getViewTreeObserver().addOnWindowFocusChangeListener(c15442xfd56d647.f215045y);
        }
    }
}
