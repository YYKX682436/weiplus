package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class pd extends ut3.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd f211166d;

    public pd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sd sdVar) {
        this.f211166d = sdVar;
    }

    @Override // ut3.e, ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle extData, ut3.c finishController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extData, "extData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finishController, "finishController");
        return false;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 model, android.os.Bundle extData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extData, "extData");
        java.lang.String str = model.f237195f;
        if (str == null) {
            str = "";
        }
        this.f211166d.c(str);
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.setResult(-1);
            activity.finish();
        }
    }
}
