package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView f103715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f103716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f103718g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView finderCommentAdVideoView, android.widget.ImageView imageView, in5.s0 s0Var, so2.y0 y0Var) {
        super(0);
        this.f103715d = finderCommentAdVideoView;
        this.f103716e = imageView;
        this.f103717f = s0Var;
        this.f103718g = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView finderCommentAdVideoView = this.f103715d;
        finderCommentAdVideoView.setMute(true);
        finderCommentAdVideoView.setOnFirstFrameRendered(new com.tencent.mm.plugin.finder.convert.g3(this.f103716e));
        in5.s0 s0Var = this.f103717f;
        so2.y0 y0Var = this.f103718g;
        finderCommentAdVideoView.setOnVideoReplay(new com.tencent.mm.plugin.finder.convert.h3(s0Var, y0Var));
        finderCommentAdVideoView.setOnProgressChange(new com.tencent.mm.plugin.finder.convert.i3(new kotlin.jvm.internal.c0(), s0Var, y0Var));
        return jz5.f0.f302826a;
    }
}
