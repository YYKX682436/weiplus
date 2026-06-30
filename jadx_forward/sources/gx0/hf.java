package gx0;

/* loaded from: classes5.dex */
public abstract class hf extends du0.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public static /* synthetic */ void V6(gx0.hf hfVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyNewStyle");
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        hfVar.U6(c3971x241f78, aVar);
    }

    public static /* synthetic */ void b7(gx0.hf hfVar, zw0.d dVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: leaveEditingStateForAll");
        }
        if ((i17 & 1) != 0) {
            dVar = null;
        }
        if ((i17 & 2) != 0) {
            InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
        }
        hfVar.a7(dVar, InvalidTime);
    }

    public static /* synthetic */ java.lang.Object d7(gx0.hf hfVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: leaveTitleEditingState");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        return hfVar.c7(z17, interfaceC29045xdcb5ca57);
    }

    public static /* synthetic */ boolean h7(gx0.hf hfVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeSegment");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        return hfVar.g7(c3971x241f78, z17, z18);
    }

    public void U6(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
    }

    public void W6(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 timeRange, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeRange, "timeRange");
    }

    public void X6(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a previewTime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewTime, "previewTime");
    }

    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 Y6(ug.m segmentType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentType, "segmentType");
        switch (segmentType) {
            case None:
            case Transition:
            case MovieClip:
            case VideoClip:
            case ImageClip:
            case Music:
            case Narration:
            case Caption:
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
                return new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(c4128x879fba0a, c4128x879fba0a);
            case MovieTitle:
                double Ri = ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Ri();
                return new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(e7(), !java.lang.Double.isInfinite(Ri) && !java.lang.Double.isNaN(Ri) ? com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Ri()) : com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(2.0d));
            case ContentDesc:
            case FancyText:
            case WhenWhere:
            case Emoticon:
                return new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(e7(), f7());
            default:
                throw new jz5.j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Z6(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 segment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        if (!(segment instanceof ug.d)) {
            return false;
        }
        ug.d dVar = (ug.d) segment;
        if (!dVar.l() || !segment.x()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SegmentEditingStateUIC", "leaveEditingState: " + segment.C());
        dVar.j();
        return true;
    }

    public void a7(zw0.d dVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a previewTime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewTime, "previewTime");
    }

    public java.lang.Object c7(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return jz5.f0.f384359a;
    }

    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a e7() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
        return ZeroTime;
    }

    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f7() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33969x7905b775 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(3.0d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33969x7905b775, "fromSeconds(...)");
        return m33969x7905b775;
    }

    public boolean g7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        return false;
    }
}
