package vr1;

/* loaded from: classes3.dex */
public final class l implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr1.o f521110d;

    public l(vr1.o oVar) {
        this.f521110d = oVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(contextMenu, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenu");
        vr1.a[] aVarArr = vr1.a.f521076d;
        contextMenu.add(0, 1, 0, this.f521110d.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ame));
    }
}
