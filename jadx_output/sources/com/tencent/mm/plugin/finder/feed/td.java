package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class td implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f109055a;

    public td(com.tencent.mm.plugin.finder.feed.af afVar) {
        this.f109055a = afVar;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.plugin.finder.feed.af afVar = this.f109055a;
        db5.t7.i(afVar.getActivity(), afVar.getActivity().getResources().getString(com.tencent.mm.R.string.e1i), com.tencent.mm.R.raw.icons_filled_done);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.plugin.finder.feed.af afVar = this.f109055a;
        db5.t7.i(afVar.getActivity(), afVar.getActivity().getResources().getString(com.tencent.mm.R.string.e1h), com.tencent.mm.R.raw.icons_filled_close);
    }
}
