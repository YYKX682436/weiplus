package com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0005\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage;", "Ll75/f0;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Ll75/c1;", "Ln75/b;", "dbProvider", "<init>", "(Ln75/b;)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sdk.storage.mvvm.MvvmStorage */
/* loaded from: classes4.dex */
public abstract class AbstractC21005xe7f8081b<T extends l75.f0> extends l75.c1<T> {

    /* renamed from: g */
    public final n75.b f274680g;

    public AbstractC21005xe7f8081b(n75.b dbProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dbProvider, "dbProvider");
        this.f274680g = dbProvider;
    }

    public static /* synthetic */ int S6(com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b abstractC21005xe7f8081b, l75.f0 f0Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            z18 = true;
        }
        return abstractC21005xe7f8081b.R6(f0Var, z17, z18);
    }

    public static boolean U6(com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b abstractC21005xe7f8081b, l75.f0 item, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: insert");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            z18 = true;
        }
        boolean z27 = (i17 & 8) != 0 ? false : z19;
        abstractC21005xe7f8081b.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o75.c cVar = new o75.c(o75.b.f425115c, java.lang.String.valueOf(item.mo9766x4c6b483e()), abstractC21005xe7f8081b.O6());
        cVar.f425123d = item;
        java.lang.String O6 = z18 ? abstractC21005xe7f8081b.O6() : null;
        return (z17 ? new m75.c(item, z27, cVar, abstractC21005xe7f8081b.P6(), O6) : new m75.c(item, z27, null, null, O6)).a(abstractC21005xe7f8081b.f274680g.Q4()) > 0;
    }

    public static long V6(com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b abstractC21005xe7f8081b, l75.f0 item, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replace");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            z18 = true;
        }
        abstractC21005xe7f8081b.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o75.c cVar = new o75.c(o75.b.f425116d, java.lang.String.valueOf(item.mo9766x4c6b483e()), abstractC21005xe7f8081b.O6());
        cVar.f425123d = item;
        java.lang.String O6 = z18 ? abstractC21005xe7f8081b.O6() : null;
        return (z17 ? new m75.d(item, cVar, abstractC21005xe7f8081b.P6(), O6) : new m75.d(item, null, null, O6)).a(abstractC21005xe7f8081b.f274680g.Q4());
    }

    public static int W6(com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b abstractC21005xe7f8081b, l75.f0 item, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            z18 = true;
        }
        abstractC21005xe7f8081b.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o75.c cVar = new o75.c(o75.b.f425116d, java.lang.String.valueOf(item.mo9766x4c6b483e()), abstractC21005xe7f8081b.O6());
        cVar.f425123d = item;
        java.lang.String O6 = z18 ? abstractC21005xe7f8081b.O6() : null;
        return (z17 ? new m75.e(item, cVar, abstractC21005xe7f8081b.P6(), O6) : new m75.e(item, null, null, O6)).a(abstractC21005xe7f8081b.f274680g.Q4());
    }

    @Override // l75.c1
    public java.lang.String O6() {
        return "MicroMsg.Mvvm.MMLiveStorage";
    }

    public int R6(l75.f0 item, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o75.b bVar = o75.b.f425114b;
        o75.c cVar = new o75.c(o75.b.f425117e, java.lang.String.valueOf(item.mo9766x4c6b483e()), O6());
        cVar.f425123d = item;
        java.lang.String O6 = z18 ? O6() : null;
        return (z17 ? new m75.b(item, cVar, P6(), O6) : new m75.b(item, null, null, O6)).a(this.f274680g.Q4());
    }

    public l75.f0 T6(android.content.ContentValues cv6, f06.d clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cv6, "cv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        l75.k0 Q4 = this.f274680g.Q4();
        p75.y yVar = null;
        if (Q4 == null) {
            return null;
        }
        java.util.Set<java.lang.String> keySet = cv6.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "keySet(...)");
        for (java.lang.String str : keySet) {
            java.lang.Object obj = cv6.get(str);
            if (obj != null) {
                if (yVar != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    yVar.f(new p75.r0(str, obj.toString()));
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    yVar = new p75.y(new p75.r0(str, obj.toString()));
                }
            }
        }
        p75.i0 i17 = ((l75.f0) xz5.a.b(clazz).newInstance()).mo9767x752de218().i();
        java.lang.String tag = O6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        i17.f434189c = tag;
        i17.f434190d = yVar;
        i17.c(1, 0);
        return i17.a().o(Q4, xz5.a.b(clazz));
    }
}
