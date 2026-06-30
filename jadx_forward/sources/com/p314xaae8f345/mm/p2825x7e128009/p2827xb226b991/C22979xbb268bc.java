package com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eJ\u0019\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0082 J)\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0082 J)\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0082 J\t\u0010\u0012\u001a\u00020\u0002H\u0082 J\u0019\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0082 J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0082 J\u0019\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0082 J\u0011\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 J\u0019\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0082 J\u0011\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/xeffect/effect/EffectManager;", "", "", "ptr", "", "type", "nCreateEffect", "", com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "nCreateEffectPath", "", "bytes", "length", "nCreateEffectBinary", "Landroid/content/res/AssetManager;", "asset", "assetPath", "nCreateEffectAsset", "nInit", "effectPtr", "nAddEffect", "effectId", "Ljz5/f0;", "nBringToFront", "nRemoveEffect", "nProfileData", "Lcom/tencent/mm/xeffect/effect/IStickerDecoderFactory;", "factory", "nSetDecoderFactory", "nDestroy", "uq5/g", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.effect.EffectManager */
/* loaded from: classes10.dex */
public final class C22979xbb268bc {

    /* renamed from: c, reason: collision with root package name */
    public static final uq5.g f296337c = new uq5.g(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f296338a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f296339b = new java.util.LinkedList();

    static {
        tq5.k.a("xlabeffect");
        tq5.k.a("pag");
        uq5.e eVar = new uq5.e();
        if (tq5.k.f502805a) {
            m83816x4e6135bd(new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22983xd503b070(eVar));
        }
    }

    public C22979xbb268bc() {
        boolean z17 = tq5.k.f502805a;
        this.f296338a = tq5.k.f502805a ? m83812x630f29e() : 0L;
    }

    /* renamed from: nAddEffect */
    private final native long m83805x565f1cc4(long ptr, long effectPtr);

    /* renamed from: nBringToFront */
    private final native void m83806x96167a0a(long j17, long j18);

    /* renamed from: nCreateEffect */
    private final native long m83807xc8f3b93b(long ptr, int type);

    /* renamed from: nCreateEffectAsset */
    private final native long m83808xefefce75(long ptr, int type, android.content.res.AssetManager asset, java.lang.String assetPath);

    /* renamed from: nCreateEffectBinary */
    private final native long m83809xf2f991c(long ptr, int type, byte[] bytes, long length);

    /* renamed from: nCreateEffectPath */
    private final native long m83810x49d47c00(long ptr, int type, java.lang.String path);

    /* renamed from: nDestroy */
    private final native void m83811x62cd7fac(long j17);

    /* renamed from: nInit */
    private final native long m83812x630f29e();

    /* renamed from: nProfileData */
    private final native long m83813xbc4ea7a5(long ptr);

    /* renamed from: nRemoveEffect */
    private final native void m83814x3a8b4ac3(long j17, long j18);

    /* renamed from: nSetDecoderFactory */
    private final native void m83815x454c265a(long j17, com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22982x712e75fa interfaceC22982x712e75fa);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nSetDefaultFactory */
    public static final native void m83816x4e6135bd(com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22982x712e75fa interfaceC22982x712e75fa);

    public final uq5.b b() {
        uq5.y g17 = g(uq5.k.BlurEffect);
        if (g17 == null) {
            throw new jz5.q("null cannot be cast to non-null type com.tencent.mm.xeffect.effect.BlurEffect");
        }
        uq5.b bVar = (uq5.b) g17;
        c(bVar);
        return bVar;
    }

    public final uq5.y c(uq5.y yVar) {
        if (yVar != null) {
            long j17 = this.f296338a;
            if (j17 != 0) {
                long m83805x565f1cc4 = m83805x565f1cc4(j17, yVar.f511802c);
                yVar.f511800a = m83805x565f1cc4;
                com.p314xaae8f345.mm.p2825x7e128009.C22977x1926be7b.f296336a.i("EffectManager", "addEffect ptr:" + yVar.f511802c + ", effectId:" + m83805x565f1cc4, new java.lang.Object[0]);
                synchronized (this.f296339b) {
                    this.f296339b.add(yVar);
                }
            }
        }
        return yVar;
    }

    public final uq5.m d() {
        uq5.y g17 = g(uq5.k.GradientBlurEffect);
        if (g17 == null) {
            throw new jz5.q("null cannot be cast to non-null type com.tencent.mm.xeffect.effect.GradientBlurEffect");
        }
        uq5.m mVar = (uq5.m) g17;
        mVar.d(20.0f);
        c(mVar);
        return mVar;
    }

    public final void e(long j17) {
        if (this.f296338a == 0) {
            return;
        }
        synchronized (this.f296339b) {
            java.util.Iterator it = this.f296339b.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else {
                    if (((uq5.y) it.next()).f511800a == j17) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (i17 >= 0) {
                java.lang.Object remove = this.f296339b.remove(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.c(remove, "effectList.removeAt(index)");
                this.f296339b.add((uq5.y) remove);
            }
            m83806x96167a0a(this.f296338a, j17);
        }
    }

    public final void f() {
        if (this.f296338a == 0) {
            return;
        }
        synchronized (this.f296339b) {
            for (uq5.y yVar : this.f296339b) {
                m83814x3a8b4ac3(this.f296338a, yVar.f511800a);
                yVar.f511800a = 0L;
            }
            this.f296339b.clear();
        }
    }

    public final uq5.y g(uq5.k type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(type, "type");
        long j17 = this.f296338a;
        uq5.g gVar = f296337c;
        return j17 == 0 ? uq5.g.a(gVar, 0L, type) : uq5.g.a(gVar, m83807xc8f3b93b(j17, type.ordinal()), type);
    }

    public final uq5.y h(uq5.k type, android.content.res.AssetManager asset, java.lang.String assetPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(asset, "asset");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(assetPath, "assetPath");
        long j17 = this.f296338a;
        uq5.g gVar = f296337c;
        return j17 == 0 ? uq5.g.a(gVar, 0L, type) : uq5.g.a(gVar, m83808xefefce75(j17, type.ordinal(), asset, assetPath), type);
    }

    public final uq5.y i(uq5.k type, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(path, "path");
        long j17 = this.f296338a;
        uq5.g gVar = f296337c;
        return j17 == 0 ? uq5.g.a(gVar, 0L, type) : uq5.g.a(gVar, m83810x49d47c00(j17, type.ordinal(), path), type);
    }

    public final uq5.y j(uq5.k type, byte[] bytes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(bytes, "bytes");
        long j17 = this.f296338a;
        uq5.g gVar = f296337c;
        if (j17 == 0) {
            return uq5.g.a(gVar, 0L, type);
        }
        long m83809xf2f991c = m83809xf2f991c(j17, type.ordinal(), bytes, bytes.length);
        uq5.y a17 = uq5.g.a(gVar, m83809xf2f991c, type);
        com.p314xaae8f345.mm.p2825x7e128009.C22977x1926be7b.f296336a.i("EffectManager", "create effect binary ptr:" + m83809xf2f991c + ", type:" + type + ", " + bytes.length, new java.lang.Object[0]);
        return a17;
    }

    public final void k() {
        f();
        long j17 = this.f296338a;
        if (j17 == 0) {
            return;
        }
        m83811x62cd7fac(j17);
    }

    public final uq5.y l(long j17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f296339b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((uq5.y) obj).f511800a == j17) {
                break;
            }
        }
        return (uq5.y) obj;
    }

    public final com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22980xaef82a82 m() {
        long j17 = this.f296338a;
        return j17 == 0 ? new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22980xaef82a82(0L) : new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22980xaef82a82(m83813xbc4ea7a5(j17));
    }

    public final void n(long j17) {
        if (this.f296338a == 0) {
            return;
        }
        synchronized (this.f296339b) {
            java.util.Iterator it = this.f296339b.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else {
                    if (((uq5.y) it.next()).f511800a == j17) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (i17 >= 0) {
                com.p314xaae8f345.mm.p2825x7e128009.C22977x1926be7b.f296336a.i("EffectManager", "removeEffect ptr:" + ((uq5.y) this.f296339b.get(i17)).f511802c + ", effectId:" + j17, new java.lang.Object[0]);
                ((uq5.y) this.f296339b.get(i17)).f511800a = 0L;
                this.f296339b.remove(i17);
            }
            m83814x3a8b4ac3(this.f296338a, j17);
        }
    }

    public final void o(uq5.y yVar) {
        if (this.f296338a == 0 || yVar == null) {
            return;
        }
        synchronized (this.f296339b) {
            this.f296339b.remove(yVar);
            m83814x3a8b4ac3(this.f296338a, yVar.f511800a);
        }
    }

    public final void p(uq5.k type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(type, "type");
        synchronized (this.f296339b) {
            java.util.LinkedList linkedList = this.f296339b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList) {
                if (((uq5.y) obj).c() == type) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o((uq5.y) it.next());
            }
        }
    }

    public final void q(com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.InterfaceC22982x712e75fa factory) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(factory, "factory");
        long j17 = this.f296338a;
        if (j17 == 0) {
            return;
        }
        m83815x454c265a(j17, new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22983xd503b070(factory));
    }

    public C22979xbb268bc(long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f296338a = j17;
    }
}
