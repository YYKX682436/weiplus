package rf4;

/* loaded from: classes4.dex */
public final class y1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 f476661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331) {
        super(2);
        this.f476661d = c18486xb54a9331;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List arrayList;
        java.util.List arrayList2;
        java.util.ArrayList arrayList3;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.lang.String content = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331.H;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331 = this.f476661d;
        c18486xb54a9331.getClass();
        if (booleanValue) {
            c18486xb54a9331.f253559x.remove(c18486xb54a9331.f253555t);
            c18486xb54a9331.f253560y = null;
            gf4.a h17 = gf4.l.f352887d.h(c18486xb54a9331.f253558w, content, c18486xb54a9331.f253555t, c18486xb54a9331.getCom.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID java.lang.String(), c18486xb54a9331.f253556u, c18486xb54a9331.f253557v);
            if4.a aVar = c18486xb54a9331.f253552q;
            if (aVar != null && (linkedList2 = aVar.f372773h) != null) {
                linkedList2.add(h17);
            }
            if4.a aVar2 = c18486xb54a9331.f253552q;
            if (aVar2 != null && (linkedList = aVar2.f372772g) != null) {
                linkedList.add(h17);
            }
            pf4.a0 a0Var = c18486xb54a9331.f253550o;
            if (a0Var != null && (arrayList3 = a0Var.f435371f) != null) {
                arrayList3.add(h17);
            }
            boolean z17 = c18486xb54a9331.f253553r;
            java.util.ArrayList arrayList4 = c18486xb54a9331.f253551p;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList4.get(1);
                if4.a aVar3 = c18486xb54a9331.f253552q;
                if (aVar3 == null || (arrayList2 = aVar3.f372773h) == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                c18485x239212ef.c(arrayList2);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef c18485x239212ef2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18485x239212ef) arrayList4.get(0);
                if4.a aVar4 = c18486xb54a9331.f253552q;
                if (aVar4 == null || (arrayList = aVar4.f372773h) == null) {
                    arrayList = new java.util.ArrayList();
                }
                c18485x239212ef2.c(arrayList);
            }
        }
        if (c18486xb54a9331.f253553r) {
            c18486xb54a9331.getCommentInputView().setVisibility(8);
            if4.a aVar5 = c18486xb54a9331.f253552q;
            if (aVar5 != null) {
                c18486xb54a9331.f253549n.e(aVar5);
            }
        }
        c18486xb54a9331.f253557v = 0;
        return jz5.f0.f384359a;
    }
}
