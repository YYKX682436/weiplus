package tt0;

/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f503319a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f503320b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f503321c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f503322d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f503323e;

    /* renamed from: f, reason: collision with root package name */
    public int f503324f;

    /* renamed from: g, reason: collision with root package name */
    public int f503325g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f503326h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f503327i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f503328j;

    public static tt0.c a(java.lang.String str) {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
        tt0.c cVar = new tt0.c();
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TemplateMsgContent", "values map is null.");
            return cVar;
        }
        cVar.f503319a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1);
        java.lang.String str2 = (java.lang.String) d17.get(".msg.fromusername");
        if (str2 == null) {
            str2 = "";
        }
        cVar.f503320b = str2;
        cVar.f503321c = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.title");
        cVar.f503324f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
        cVar.f503322d = (java.lang.String) d17.get(".msg.appmsg.template_id");
        cVar.f503323e = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.weapp_username");
        cVar.f503325g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.new_tmpl_type"), -1);
        cVar.f503326h = (java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.digest");
        cVar.f503328j = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.message_folder_id");
        int i17 = 0;
        while (true) {
            if (i17 >= 100) {
                break;
            }
            java.lang.String str3 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line";
            if (i17 != 0) {
                str3 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line" + i17;
            }
            java.lang.String str4 = (java.lang.String) d17.get(str3 + ".value.word");
            java.lang.String str5 = (java.lang.String) d17.get(str3 + ".key.word");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TemplateMsgContent", "visit lines: lines count=%d", java.lang.Integer.valueOf(i17));
                break;
            }
            tt0.b bVar = new tt0.b();
            bVar.f503318b = str4;
            if (str5 == null) {
                str5 = "";
            }
            bVar.f503317a = str5;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(str3 + ".key.hide"), 0);
            ((java.util.ArrayList) cVar.f503327i).add(bVar);
            i17++;
        }
        return cVar;
    }
}
