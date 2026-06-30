package ro4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f479656a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f479657b = new java.util.LinkedList();

    public c() {
        try {
            java.io.InputStream open = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("pag/magic/pag_magic.json");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(open, "open(...)");
            java.lang.String N1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N1(open);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicListData", "initVideoTemplates config:" + N1);
            cl0.e f17 = new cl0.g(N1).f("magicList");
            int mo15056xbe0e3ae6 = f17.mo15056xbe0e3ae6();
            for (int i17 = 0; i17 < mo15056xbe0e3ae6; i17++) {
                cl0.g jSONObject = f17.getJSONObject(i17);
                if (jSONObject.mo15080xc3ca103c("use", 0) == 1) {
                    this.f479657b.add(new ro4.a("pag/magic/" + jSONObject.mo15082x48bce8a4("pag"), "pag/magic/" + jSONObject.mo15082x48bce8a4("cover")));
                }
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicListData", "parse magic config error");
        }
    }

    public final java.util.List a() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f479656a;
        if (linkedList2.size() > 0) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gpf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            linkedList.add(new ro4.f(string));
            linkedList.addAll(linkedList2);
        }
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gpg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        linkedList.add(new ro4.f(string2));
        java.util.Iterator it = this.f479657b.iterator();
        while (it.hasNext()) {
            linkedList.add(new ro4.d((ro4.a) it.next()));
        }
        return linkedList;
    }
}
