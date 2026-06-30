package m90;

/* loaded from: classes.dex */
public final class c1 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String subType, java.util.Map values, com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subType, "subType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandleFinderNewXmlReceived", "on new xml received: " + values);
            if (values.get(".sysmsg.sysmsgtemplate.content_template") != null) {
                java.lang.String str = (java.lang.String) values.get(".sysmsg.sysmsgtemplate.content_template.$type");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("tmpl_type_chatroom_finder", str)) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HandleFinderNewXmlReceived", "non supported type: " + str);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HandleFinderNewXmlReceived", th6, "onNewXmlReceived", new java.lang.Object[0]);
        }
    }
}
