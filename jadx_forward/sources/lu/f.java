package lu;

/* loaded from: classes9.dex */
public final class f extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String m144872x74292566;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        int i17 = simpleMsgInfo.f427150d;
        cVar.m126728xdc93280d(simpleMsgInfo.m75945x2fec8307(i17 + 13));
        v05.b k17 = cVar.k();
        java.lang.String str = "";
        if (k17 == null || (m144872x74292566 = k17.m75945x2fec8307(k17.f449898d + 0)) == null) {
            l15.b j17 = cVar.j();
            m144872x74292566 = j17 != null ? j17.m144872x74292566() : null;
            if (m144872x74292566 == null) {
                m144872x74292566 = "";
            }
        }
        recordDataItem.f0(m144872x74292566);
        v05.b k18 = cVar.k();
        if (k18 != null && (m75945x2fec8307 = k18.m75945x2fec8307(k18.f513848e + 11)) != null) {
            str = m75945x2fec8307;
        }
        recordDataItem.g0(str);
        v05.b k19 = cVar.k();
        if (k19 != null && k19.m75939xb282bd08(k19.f513848e + 1) == 1) {
            new ku.j().a(simpleMsgInfo, recordDataItem);
            return true;
        }
        java.lang.Class cls = (java.lang.Class) ((java.util.HashMap) ((jz5.n) ((ot.q) i95.n0.c(ot.q.class)).f429862n).mo141623x754a37bb()).get(java.lang.Integer.valueOf(simpleMsgInfo.m75939xb282bd08(i17 + 5)));
        if (cls != null) {
            java.lang.Object newInstance = cls.getConstructors()[0].newInstance(new java.lang.Object[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.feature.appmsg.record.IAppMsgRecordBuildXmlApi");
            return ((gu.e) newInstance).a(simpleMsgInfo, recordDataItem);
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String m163586x74292566 = recordDataItem.m163586x74292566();
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(m163586x74292566);
        if (h17 == null || !h17.k()) {
            new ku.j().a(simpleMsgInfo, recordDataItem);
            return true;
        }
        int i18 = recordDataItem.f384955d;
        recordDataItem.set(i18 + 2, 1);
        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f571981vc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getString(...)");
        recordDataItem.set(i18 + 1, g17);
        return true;
    }
}
