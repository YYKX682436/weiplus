package com.p314xaae8f345.mm.ui.p2710x1c644e5f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/ViewCreatorFragment;", "Landroidx/fragment/app/Fragment;", "Ltk5/a;", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.halfscreen.ViewCreatorFragment */
/* loaded from: classes8.dex */
public final class C22417x8d86e117 extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 implements tk5.a {

    /* renamed from: d, reason: collision with root package name */
    public final bh5.k f290356d;

    /* renamed from: e, reason: collision with root package name */
    public tk5.c f290357e;

    /* renamed from: f, reason: collision with root package name */
    public tk5.b f290358f;

    public C22417x8d86e117(bh5.k viewCreator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewCreator, "viewCreator");
        this.f290356d = viewCreator;
    }

    @Override // tk5.a
    public void G() {
        tk5.b bVar = this.f290358f;
        if (bVar != null) {
            com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7 = ((bh5.x) bVar).f102504a;
            c22415x6ef905d7.mo7391x63a3b28a();
            ((jz5.n) c22415x6ef905d7.B).mo141623x754a37bb();
        }
    }

    @Override // tk5.a
    public void M(tk5.c router) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(router, "router");
        this.f290357e = router;
    }

    @Override // tk5.a
    public boolean i() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = ((uf5.j) this.f290356d).f508780a;
        return c1163xf1deaba4 == null || !c1163xf1deaba4.canScrollVertically(-1);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7397x3b13c504(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        context.toString();
        super.mo7397x3b13c504(context);
        tk5.b bVar = this.f290358f;
        if (bVar != null) {
            com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7 = ((bh5.x) bVar).f102504a;
            com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22412x5e02431c c22412x5e02431c = c22415x6ef905d7.f290345p;
            if (c22412x5e02431c != null) {
                c22412x5e02431c.m80688x4e740634(new bh5.v(c22415x6ef905d7));
            }
            com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22412x5e02431c c22412x5e02431c2 = c22415x6ef905d7.f290345p;
            if (c22412x5e02431c2 == null) {
                return;
            }
            c22412x5e02431c2.m80689xdf36bd7c(new bh5.w(c22415x6ef905d7));
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        java.util.Objects.toString(bundle);
        super.mo7398x3e5a77bb(bundle);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        inflater.toString();
        java.util.Objects.toString(viewGroup);
        java.util.Objects.toString(bundle);
        uf5.j jVar = (uf5.j) this.f290356d;
        jVar.getClass();
        android.view.View inflate = inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dz8, (android.view.ViewGroup) null, false);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate.findViewById(com.p314xaae8f345.mm.R.id.u17);
        jVar.f508780a = c1163xf1deaba4;
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.u1e);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.u1f);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.u1g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        uf5.k kVar = jVar.f508781b;
        java.util.HashSet hashSet = jVar.f508782c;
        java.util.ArrayList arrayList = jVar.f508783d;
        uf5.k.a(kVar, imageView, hashSet, arrayList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(button);
        uf5.k.b(kVar, button, hashSet);
        uf5.h hVar = new uf5.h(jVar.f508783d, jVar.f508782c, jVar.f508781b, imageView, button);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(kVar.f508787a));
        c1163xf1deaba4.mo7960x6cab2c8d(hVar);
        uf5.i iVar = new uf5.i(jVar.f508782c, jVar.f508783d, hVar, jVar.f508781b, imageView, button);
        imageView.setOnClickListener(iVar);
        textView.setOnClickListener(iVar);
        button.setOnClickListener(new uf5.e(kVar, arrayList, hashSet));
        return inflate;
    }

    @Override // tk5.a
    /* renamed from: t, reason: from getter */
    public tk5.c getG() {
        return this.f290357e;
    }

    @Override // tk5.a
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 u() {
        return this;
    }
}
