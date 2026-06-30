package ze2;

/* loaded from: classes3.dex */
public final class d implements we2.c0 {
    @Override // we2.c0
    public boolean a(we2.c cgiResp) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiResp, "cgiResp");
        int i18 = cgiResp.f526752b;
        if ((i18 == 4 && cgiResp.f526751a == -100020) || (i17 = cgiResp.f526751a) == -200001) {
            return false;
        }
        if (i18 == 0 && i17 == 0) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveMsgRespErrCodeInterceptor", "doGetLiveMsg errCode:" + cgiResp.f526751a);
        return false;
    }
}
