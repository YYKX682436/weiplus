package fr5;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f347510a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f347511b;

    /* renamed from: c, reason: collision with root package name */
    public final fr5.b f347512c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.GestureDetector f347513d;

    /* renamed from: e, reason: collision with root package name */
    public final fr5.m f347514e;

    public j0(android.view.View view, yz5.l lVar, yz5.l lVar2, yz5.l lVar3, yz5.l onSingleTapConfirmedCallback, yz5.l onLongPressCallback, yz5.l onDoubleTapPressCallback, yz5.l onDoubleTapUpCallback, yz5.p canDrag, yz5.r onGestureCallback, yz5.l onEndCallback, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        yz5.l lVar4 = (i17 & 2) != 0 ? null : lVar;
        yz5.l lVar5 = (i17 & 4) != 0 ? null : lVar2;
        yz5.l lVar6 = (i17 & 8) != 0 ? null : lVar3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSingleTapConfirmedCallback, "onSingleTapConfirmedCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onLongPressCallback, "onLongPressCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDoubleTapPressCallback, "onDoubleTapPressCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDoubleTapUpCallback, "onDoubleTapUpCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canDrag, "canDrag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onGestureCallback, "onGestureCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onEndCallback, "onEndCallback");
        this.f347512c = new fr5.b(new fr5.g0(this, lVar4, onDoubleTapUpCallback, lVar5, lVar6));
        this.f347513d = new android.view.GestureDetector(view.getContext(), new fr5.i0(onSingleTapConfirmedCallback, onLongPressCallback, this, onDoubleTapPressCallback));
        this.f347514e = new fr5.m(view, canDrag, new fr5.h0(this, onGestureCallback, onEndCallback));
    }
}
