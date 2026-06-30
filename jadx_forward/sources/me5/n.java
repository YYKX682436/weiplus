package me5;

/* loaded from: classes4.dex */
public class n extends ih3.n {
    @Override // ih3.n
    public java.lang.String a() {
        return "link_revoke_unbindapp";
    }

    @Override // ih3.n
    public java.lang.CharSequence b(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        java.lang.String str3 = (java.lang.String) map.get(str + ".username");
        java.lang.String str4 = (java.lang.String) map.get(str + ".appid");
        java.lang.String str5 = (java.lang.String) map.get(str + ".appname");
        java.lang.String str6 = (java.lang.String) map.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.memberlist.member.nickname");
        java.lang.String string = bundle.getString("conv_talker_username");
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        me5.j jVar = new me5.j(this, 1, null, weakReference, str6, str5, str3, str4, string, map, bundle, weakReference2);
        jVar.m75740x3ab833d4(true);
        spannableString.setSpan(jVar, 0, str2.length(), 33);
        return spannableString;
    }
}
