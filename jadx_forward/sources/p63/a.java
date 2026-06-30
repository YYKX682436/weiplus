package p63;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp63/a;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-generic-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        byte[] byteArray;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null && (byteArray = bundle.getByteArray("finderReportAffFinderTask")) != null) {
            r45.a6 a6Var = new r45.a6();
            a6Var.mo11468x92b714fd(byteArray);
            boolean z17 = a6Var.f451287m;
            p63.b bVar = p63.b.f433970a;
            if (z17) {
                int i17 = a6Var.f451284g;
                int i18 = a6Var.f451283f;
                java.lang.String targetPageName = a6Var.f451288n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(targetPageName, "targetPageName");
                java.lang.String pageSimpleName = a6Var.f451281d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pageSimpleName, "pageSimpleName");
                long j17 = a6Var.f451285h;
                java.lang.String params = a6Var.f451286i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(params, "params");
                if (bVar.c() && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.j a17 = bVar.a();
                    if (a17 != null) {
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k kVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k();
                        kVar.f298149d = pageSimpleName;
                        kVar.f298151f = i18;
                        kVar.f298153h = j17;
                        java.util.Map map = o63.h.f424733a;
                        o63.f fVar = (o63.f) o63.h.f424733a.get(targetPageName);
                        kVar.f298154i = fVar != null ? fVar.f424731b : false ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.i.PAGE_OUT : com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.i.DEFAULT;
                        kVar.f298155m = params;
                        kVar.f298152g = i17;
                        a17.d(kVar);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffFinderReport", "onPageAppear: taskId: " + i17 + ", targetPageHC: " + i18 + ", targetPageName: " + targetPageName + ", targetSimpleName: " + pageSimpleName + ", timestamp: " + j17 + ", params: " + params);
                }
            } else {
                int i19 = a6Var.f451284g;
                int i27 = a6Var.f451283f;
                java.lang.String targetPageName2 = a6Var.f451288n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(targetPageName2, "targetPageName");
                bVar.d(i19, i27, targetPageName2, a6Var.f451285h);
            }
        }
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0();
    }
}
