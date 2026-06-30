package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/edit/FinderFixPhotoEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.edit.FinderFixPhotoEditPluginLayout */
/* loaded from: classes3.dex */
public final class C13723x3e57ef0a extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17015x41d97285 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f186836w = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13723x3e57ef0a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a().b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17015x41d97285, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce, yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        postDelayed(new dc2.a(this), 300L);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17015x41d97285, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 32) {
            mo9064x4ceae47d();
            return;
        }
        if (ordinal == 65) {
            postDelayed(new dc2.c(this), 300L);
        } else if (ordinal != 72) {
            super.w(status, bundle);
        } else {
            super.w(status, bundle);
        }
    }
}
