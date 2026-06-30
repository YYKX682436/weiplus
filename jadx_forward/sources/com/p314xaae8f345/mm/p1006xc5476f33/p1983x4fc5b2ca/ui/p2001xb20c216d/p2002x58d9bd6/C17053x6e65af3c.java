package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2002x58d9bd6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderFavFragment;", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioFinderTabFragment;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderFavFragment */
/* loaded from: classes.dex */
public final class C17053x6e65af3c extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2002x58d9bd6.AbstractC17055xfd8ec9b6 {

    /* renamed from: p, reason: collision with root package name */
    public wt3.o0 f237630p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f237631q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17053x6e65af3c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        gm0.j1.d().a(3966, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2002x58d9bd6.AbstractC17055xfd8ec9b6
    public void c() {
        this.f237630p = new wt3.o0(this.f237631q);
        gm0.j1.d().g(this.f237630p);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2002x58d9bd6.AbstractC17055xfd8ec9b6
    public void e() {
        super.e();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f237630p, m1Var)) {
            return;
        }
        this.f237630p = null;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((wt3.o0) m1Var).f530994d;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
            this.f237631q = ((r45.x51) fVar).m75934xbce7f2f(2);
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
            java.util.LinkedList m75941xfb821914 = ((r45.x51) fVar2).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
            d(m75941xfb821914, ((r45.x51) fVar3).m75939xb282bd08(3) != 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17053x6e65af3c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        gm0.j1.d().a(3966, this);
    }
}
