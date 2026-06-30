package cg2;

/* loaded from: classes3.dex */
public final class g implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f41103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f41104b;

    public g(dk2.zf zfVar, android.content.Context context) {
        this.f41103a = zfVar;
        this.f41104b = context;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q().r()).booleanValue()) {
            dk2.zf zfVar = this.f41103a;
            dk2.cg cgVar = zfVar instanceof dk2.cg ? (dk2.cg) zfVar : null;
            if (cgVar != null) {
                int s17 = cgVar.s();
                android.content.Context context = this.f41104b;
                g4Var.h(5, s17 > 0 ? com.tencent.mm.plugin.finder.assist.w2.o(cgVar.s(), false) : context.getString(com.tencent.mm.R.string.ci6), !cgVar.o() ? com.tencent.mm.R.raw.icons_outlined_star_new : com.tencent.mm.R.raw.icons_filled_good, !((dk2.cg) zfVar).o() ? -1 : context.getColor(com.tencent.mm.R.color.Red_100));
            }
        }
        g4Var.h(2, "", com.tencent.mm.R.raw.icons_filled_more, -1);
    }
}
