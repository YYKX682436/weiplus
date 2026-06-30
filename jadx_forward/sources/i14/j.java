package i14;

/* loaded from: classes8.dex */
public final class j extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i14.k f368863b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i14.k kVar) {
        super(kVar);
        this.f368863b = kVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... extraData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        this.f368863b.a(context, eVar, java.util.Arrays.copyOf(extraData, extraData.length));
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efq, viewGroup, false);
        i14.i iVar = this.f368863b.f368868u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(iVar, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.fts.FTSSettingSearchDataItem.FTSSettingSearchViewHolder");
        iVar.f368861b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        iVar.f368862c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        iVar.f368860a = inflate.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        inflate.setTag(iVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... extraData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        i14.k kVar = this.f368863b;
        a(kVar.i(), kVar.f368864q);
        wd0.x1 x1Var = kVar.f368865r;
        if (x1Var == null) {
            return true;
        }
        wd0.y1 y1Var = (wd0.y1) i95.n0.c(wd0.y1.class);
        android.content.Context context2 = view != null ? view.getContext() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((vd0.l3) y1Var).Ui((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2, x1Var);
        return true;
    }
}
