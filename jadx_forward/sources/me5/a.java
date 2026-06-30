package me5;

/* loaded from: classes3.dex */
public final class a extends ih3.n {
    @Override // ih3.n
    public java.lang.String a() {
        return "link_ecs_gift";
    }

    @Override // ih3.n
    public java.lang.CharSequence b(java.util.Map values, java.lang.String head, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(head, "head");
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.neo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String concat = head.concat(".ecsgift.orderid");
        if (values.get(concat) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SysMsgTemplateLinkHandlerEcsGift", "handleImp, get orderId failed");
            return string;
        }
        java.lang.String str = (java.lang.String) values.get(concat);
        java.lang.Object obj = (java.lang.String) values.get(head.concat(".ecsgift.scene"));
        if (obj == null) {
            obj = 1;
        }
        return "<_wc_custom_link_ color=\"#CCAB64\" href=\"weixin://ecsgift/orderid/" + str + "?scene=" + obj + "\">" + string + "</_wc_custom_link_>";
    }
}
