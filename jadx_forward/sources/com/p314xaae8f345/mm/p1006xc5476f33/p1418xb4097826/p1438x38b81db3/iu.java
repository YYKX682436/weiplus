package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class iu extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f185227d;

    /* renamed from: e, reason: collision with root package name */
    public int f185228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ku f185229f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ku kuVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f185229f = kuVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.iu(this.f185229f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.iu) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f185228e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ku kuVar = this.f185229f;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = kuVar.f185394h;
            if (c22789xd23e9a9b3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicIcon");
                throw null;
            }
            if (c22789xd23e9a9b3.getUseRfx()) {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = kuVar.f185394h;
                if (c22789xd23e9a9b4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicIcon");
                    throw null;
                }
                rj.j a17 = nn2.d.f420204a.a();
                this.f185227d = c22789xd23e9a9b4;
                this.f185228e = 1;
                java.lang.Object j17 = ((b51.m) a17).j("ting_music_play_icon.pag", "Finder.FinderProfileTingAudioPatchItemConvert", this);
                if (j17 == aVar) {
                    return aVar;
                }
                c22789xd23e9a9b2 = c22789xd23e9a9b4;
                obj = j17;
                c22789xd23e9a9b2.mo82566x3e3ac3e8((com.p314xaae8f345.mm.rfx.C20942x379cf5ee) obj);
            } else {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b5 = kuVar.f185394h;
                if (c22789xd23e9a9b5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicIcon");
                    throw null;
                }
                rj.j a18 = nn2.d.f420204a.a();
                this.f185227d = c22789xd23e9a9b5;
                this.f185228e = 2;
                java.lang.Object h17 = ((b51.m) a18).h("ting_music_play_icon.pag", "Finder.FinderProfileTingAudioPatchItemConvert", this);
                if (h17 == aVar) {
                    return aVar;
                }
                c22789xd23e9a9b = c22789xd23e9a9b5;
                obj = h17;
                c22789xd23e9a9b.mo82568x3e3ac3e8((org.p3363xbe4143f1.C29690xfae77312) obj);
            }
        } else if (i17 == 1) {
            c22789xd23e9a9b2 = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) this.f185227d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c22789xd23e9a9b2.mo82566x3e3ac3e8((com.p314xaae8f345.mm.rfx.C20942x379cf5ee) obj);
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) this.f185227d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c22789xd23e9a9b.mo82568x3e3ac3e8((org.p3363xbe4143f1.C29690xfae77312) obj);
        }
        return jz5.f0.f384359a;
    }
}
