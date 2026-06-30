package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* loaded from: classes5.dex */
public class j0 extends com.p314xaae8f345.p457x3304c6.p479x4179489f.AbstractC4153x96cfff3a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.y f130040a;

    public j0(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db, boolean z17, com.p314xaae8f345.p457x3304c6.p479x4179489f.y yVar) {
        super(c4152x8b3cf7db, z17);
        this.f130040a = yVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.AbstractC4153x96cfff3a
    /* renamed from: onInvoke */
    public void mo34186x48671b37(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db, java.lang.Object obj) {
        java.lang.String segmentID;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4154xf4b72ada.OnSafeAreaTrackingArg onSafeAreaTrackingArg = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4154xf4b72ada.OnSafeAreaTrackingArg) obj;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.y yVar = this.f130040a;
        if (yVar == null || onSafeAreaTrackingArg == null) {
            return;
        }
        boolean z17 = onSafeAreaTrackingArg.f16138xb9a89bd7;
        segmentID = onSafeAreaTrackingArg.f16139x9ef9a78e;
        yw0.t tVar = (yw0.t) yVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        boolean z18 = tVar.f548127h && tVar.f548126g;
        yw0.r rVar = tVar.f548120a;
        if (!z18 && (!tVar.f548125f.isEmpty()) && !z17) {
            ((yw0.l) rVar).f548102a.f548104a.performHapticFeedback(0, 2);
        }
        tVar.f548126g = !z17;
        yw0.l lVar = (yw0.l) rVar;
        lVar.a();
        boolean z19 = tVar.f548127h && tVar.f548126g;
        java.lang.String safaPlaceTip = tVar.f548123d;
        if (z19) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(safaPlaceTip, "safaPlaceTip");
            lVar.c(safaPlaceTip, true);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(safaPlaceTip, "safaPlaceTip");
            lVar.c(safaPlaceTip, false);
        }
    }
}
