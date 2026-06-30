package pi4;

/* loaded from: classes11.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.p2270x5c4d208.C18602xa9b36ec3 f436357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f436358e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.p2270x5c4d208.C18602xa9b36ec3 c18602xa9b36ec3, java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f436357d = c18602xa9b36ec3;
        this.f436358e = arrayList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pi4.c(this.f436357d, this.f436358e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        pi4.c cVar = (pi4.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.p2270x5c4d208.C18602xa9b36ec3 c18602xa9b36ec3;
        java.util.ArrayList arrayList;
        int i17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        while (true) {
            c18602xa9b36ec3 = this.f436357d;
            int childCount = c18602xa9b36ec3.getChildCount();
            arrayList = this.f436358e;
            i17 = 0;
            if (childCount <= arrayList.size()) {
                break;
            }
            c18602xa9b36ec3.removeViewAt(0);
        }
        while (c18602xa9b36ec3.getChildCount() < arrayList.size()) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(c18602xa9b36ec3.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571090dx5, (android.view.ViewGroup) c18602xa9b36ec3, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            c18602xa9b36ec3.addView(inflate, -1, -2);
        }
        for (java.lang.Object obj2 : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            mj4.h hVar = (mj4.h) obj2;
            android.view.View childAt = c18602xa9b36ec3.getChildAt(i17);
            childAt.setTag(hVar);
            android.widget.TextView textView = (android.widget.TextView) childAt.findViewById(com.p314xaae8f345.mm.R.id.rex);
            mj4.k kVar = (mj4.k) hVar;
            mj4.a aVar2 = kVar.f408600b;
            int i19 = aVar2.f76549x29d3a50c;
            if (i19 == 5) {
                textView.setText(i65.a.r(c18602xa9b36ec3.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.jx_));
            } else if (i19 == 6) {
                pj4.g2 b17 = oj4.j.f427348a.b(aVar2.f76512x81959a6e);
                textView.setText(b17 != null ? b17.f436604p : null);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update: index=");
            sb6.append(i17);
            sb6.append(", createTime=");
            mj4.a aVar3 = kVar.f408600b;
            sb6.append(aVar3.f76512x81959a6e);
            sb6.append(", state=");
            sb6.append(aVar3.f76549x29d3a50c);
            sb6.append(", text=");
            sb6.append((java.lang.Object) textView.getText());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopicErrorLayout", sb6.toString());
            childAt.setOnClickListener(new pi4.b(c18602xa9b36ec3));
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
