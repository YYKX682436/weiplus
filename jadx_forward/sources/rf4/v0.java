package rf4;

/* loaded from: classes4.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f f476648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f c18482x82fd8d8f) {
        super(2);
        this.f476648d = c18482x82fd8d8f;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e5;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e52;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18481x2b6a00e5 c18481x2b6a00e53;
        java.lang.String content = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f c18482x82fd8d8f = this.f476648d;
        c18482x82fd8d8f.f253506y = booleanValue;
        boolean z17 = c18482x82fd8d8f.f253507z;
        java.util.LinkedHashMap linkedHashMap = c18482x82fd8d8f.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd c18475x542840cd = c18482x82fd8d8f.f253488d;
        if (!z17) {
            if (booleanValue) {
                linkedHashMap.remove(c18482x82fd8d8f.C);
                c18482x82fd8d8f.A = null;
                c18482x82fd8d8f.f253500s.f372772g.add(gf4.l.f352887d.h(c18482x82fd8d8f.f253501t, content, c18482x82fd8d8f.C, c18482x82fd8d8f.getCom.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID java.lang.String(), c18482x82fd8d8f.f253498q, c18482x82fd8d8f.D));
                com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd.d(c18475x542840cd, c18482x82fd8d8f.f253500s.f372772g, false, 2, null);
                c18475x542840cd.b();
            }
            rf4.a aVar = c18482x82fd8d8f.f253505x;
            if (aVar != null) {
                aVar.dismiss();
            }
        } else if (booleanValue) {
            linkedHashMap.remove(c18482x82fd8d8f.C);
            c18482x82fd8d8f.A = null;
            gf4.a h17 = gf4.l.f352887d.h(c18482x82fd8d8f.f253501t, content, c18482x82fd8d8f.C, c18482x82fd8d8f.getCom.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID java.lang.String(), c18482x82fd8d8f.f253498q, c18482x82fd8d8f.D);
            c18482x82fd8d8f.f253500s.f372772g.add(h17);
            c18482x82fd8d8f.f253500s.f372773h.add(h17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd.d(c18475x542840cd, c18482x82fd8d8f.f253500s.f372772g, false, 2, null);
            rf4.a aVar2 = c18482x82fd8d8f.f253505x;
            if (aVar2 != null && (c18481x2b6a00e53 = aVar2.f476548f) != null) {
                java.util.LinkedList storyComments = c18482x82fd8d8f.f253500s.f372772g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyComments, "storyComments");
                c18481x2b6a00e53.f253476p.x(storyComments);
            }
            rf4.a aVar3 = c18482x82fd8d8f.f253505x;
            if (aVar3 != null && (c18481x2b6a00e52 = aVar3.f476548f) != null) {
                c18481x2b6a00e52.f253476p.m8146xced61ae5();
            }
            rf4.a aVar4 = c18482x82fd8d8f.f253505x;
            if (aVar4 != null && (c18481x2b6a00e5 = aVar4.f476548f) != null) {
                int size = c18482x82fd8d8f.f253500s.f372772g.size() - 1;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(size));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c18481x2b6a00e5, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView$commentInputCallback$1", "invoke", "(Ljava/lang/String;Z)V", "Undefined", "scrollToPosition", "(I)V");
                c18481x2b6a00e5.f253475o.post(new rf4.h0(c18481x2b6a00e5, ((java.lang.Integer) arrayList.get(0)).intValue()));
                yj0.a.f(c18481x2b6a00e5, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$commentInputCallback$1", "invoke", "(Ljava/lang/String;Z)V", "Undefined", "scrollToPosition", "(I)V");
            }
        } else {
            rf4.a aVar5 = c18482x82fd8d8f.f253505x;
            if (aVar5 != null) {
                aVar5.dismiss();
            }
        }
        return jz5.f0.f384359a;
    }
}
