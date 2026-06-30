package me5;

/* loaded from: classes3.dex */
public final class c extends ih3.n {
    @Override // ih3.n
    public java.lang.String a() {
        return "link_ecs_jump_info";
    }

    @Override // ih3.n
    public java.lang.CharSequence b(java.util.Map values, java.lang.String head, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(head, "head");
        java.lang.String str = (java.lang.String) values.get(head.concat(".action"));
        int i17 = 0;
        int intValue = (str == null || (h18 = r26.h0.h(str)) == null) ? 0 : h18.intValue();
        java.lang.String str2 = (java.lang.String) values.get(head.concat(".scene"));
        if (str2 != null && (h17 = r26.h0.h(str2)) != null) {
            i17 = h17.intValue();
        }
        java.lang.String str3 = (java.lang.String) values.get(head.concat(".ecsjumpinfo"));
        java.lang.String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str5 = (java.lang.String) values.get(head.concat(".content"));
        java.lang.String str6 = (java.lang.String) values.get(head.concat(".color"));
        java.lang.String str7 = (java.lang.String) values.get(head.concat(".reportextradata"));
        if (str7 != null) {
            if (!(!r26.n0.N(str7))) {
                str7 = null;
            }
            if (str7 != null) {
                str4 = str7;
            }
        }
        java.lang.String b17 = fp.s0.b(str4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        java.lang.String str8 = "<_wc_custom_link_ color= \"" + str6 + "\" href=\"weixin://ecsnewxmljump?jumpinfo=" + fp.s0.b(str3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c) + "&scene=" + i17 + "&action=" + intValue + "&reportextradata=" + b17 + "\">" + str5 + "</_wc_custom_link_>";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SysMsgTemplateLinkHandlerEcsJumpInfo", str8);
        return str8;
    }
}
