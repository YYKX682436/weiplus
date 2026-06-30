package zl2;

/* loaded from: classes3.dex */
public final class h implements ut3.d {
    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle extData, ut3.c finishController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extData, "extData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finishController, "finishController");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCoverEditHelper", "onFinishBtnClick: called");
        return false;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 model, android.os.Bundle extData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extData, "extData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCoverEditHelper", "onMediaGenerated: called");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_extra_data", extData);
        intent.putExtra("KSEGMENTMEDIAINFO", model);
        android.app.Activity activity = (android.app.Activity) context;
        activity.setResult(-1, intent);
        activity.finish();
    }

    @Override // ut3.d
    public void r3(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 reportInfo, android.os.Bundle extData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extData, "extData");
    }
}
