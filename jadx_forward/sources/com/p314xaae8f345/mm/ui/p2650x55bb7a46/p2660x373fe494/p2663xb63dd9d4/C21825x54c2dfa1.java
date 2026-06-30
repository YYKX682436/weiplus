package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/ui/chatting/history/groups/MsgHistoryGalleryGroup$buildItemConvertFactory$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.history.groups.MsgHistoryGalleryGroup$buildItemConvertFactory$1 */
/* loaded from: classes10.dex */
public final class C21825x54c2dfa1 implements in5.s {

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g f39420xcbdd23aa;

    public C21825x54c2dfa1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.g gVar) {
        this.f39420xcbdd23aa = gVar;
    }

    @Override // in5.s
    /* renamed from: getItemConvert */
    public in5.r mo43555xf2bb75ea(int type) {
        if (type == -2) {
            return new uc5.n0();
        }
        if (type == -1) {
            return new uc5.g0();
        }
        if (type == 0) {
            return new uc5.o0();
        }
        for (uc5.p pVar : this.f39420xcbdd23aa.c()) {
            java.lang.Class clazz = pVar.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
            if (clazz.getName().hashCode() == type) {
                return new uc5.q(pVar.d());
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
