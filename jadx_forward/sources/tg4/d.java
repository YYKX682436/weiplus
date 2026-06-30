package tg4;

/* loaded from: classes7.dex */
public abstract class d extends tg4.c {
    @Override // tg4.c
    public void w(org.json.JSONObject data, com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d rootView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBBaseRemoveCoverViewJsApi", "invokeImpl:data:" + data + ",viewId:" + i17);
        if (rootView.getF150208e() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBBaseRemoveCoverViewJsApi", "rootView.getCustomViewContainer() == null");
            v("fail:coverview is null");
            return;
        }
        wq0.a f150208e = rootView.getF150208e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f150208e);
        if (!(f150208e.p(i17) != null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBBaseRemoveCoverViewJsApi", "view for this viewId is null");
            v("fail:view for this viewId is null");
            return;
        }
        wq0.a f150208e2 = rootView.getF150208e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f150208e2);
        if (!f150208e2.r(i17)) {
            v("fail:removeView error");
            return;
        }
        v("");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBBaseRemoveCoverViewJsApi", "remove view:viewId:" + i17 + ",result:true");
    }
}
