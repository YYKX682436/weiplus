package nx0;

/* loaded from: classes5.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10979xd03dfd61 f422657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.u f422658e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10979xd03dfd61 c10979xd03dfd61, nx0.u uVar) {
        super(2);
        this.f422657d = c10979xd03dfd61;
        this.f422658e = uVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10984x806b8ef5 m47342xb3543e45;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10984x806b8ef5 m47342xb3543e452;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m47340x4905e9fa;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10984x806b8ef5 m47342xb3543e453;
        int intValue = ((java.lang.Number) obj).intValue();
        nx0.x beautyItem = (nx0.x) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beautyItem, "beautyItem");
        boolean z17 = beautyItem instanceof nx0.w;
        nx0.u uVar = this.f422658e;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10979xd03dfd61 c10979xd03dfd61 = this.f422657d;
        if (z17) {
            c10979xd03dfd61.f151116o = null;
            c10979xd03dfd61.f151117p = -1;
            uVar.z();
            m47342xb3543e453 = c10979xd03dfd61.m47342xb3543e45();
            m47342xb3543e453.setVisibility(4);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c10979xd03dfd61.f151113i, beautyItem)) {
                java.util.List list = uVar.f422765d;
                int i17 = 0;
                for (java.lang.Object obj3 : list) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    nx0.x xVar = (nx0.x) obj3;
                    if ((xVar instanceof nx0.w) && xVar.f422791a) {
                        xVar.f422791a = false;
                        uVar.m8147xed6e4d18(i17);
                    }
                    i17 = i18;
                }
                nx0.w wVar = (nx0.w) beautyItem;
                c10979xd03dfd61.f151113i = wVar;
                c10979xd03dfd61.f151114m = intValue;
                if (wVar.f422786f) {
                    ((nx0.x) list.get(intValue)).f422791a = true;
                    uVar.m8147xed6e4d18(intValue);
                } else {
                    java.lang.Object obj4 = list.get(intValue);
                    nx0.w wVar2 = obj4 instanceof nx0.w ? (nx0.w) obj4 : null;
                    if (wVar2 != null) {
                        wVar2.f422791a = true;
                        wVar2.f422785e = true;
                    }
                    uVar.m8147xed6e4d18(intValue);
                }
                nx0.g1 g1Var = new nx0.g1(beautyItem, uVar, intValue);
                nx0.w wVar3 = c10979xd03dfd61.f151113i;
                if (wVar3 != null) {
                    c10979xd03dfd61.f151119r.mo149xb9724478(wVar3, new nx0.j1(c10979xd03dfd61, wVar3, g1Var));
                }
            }
        } else if ((beautyItem instanceof nx0.v) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c10979xd03dfd61.f151116o, beautyItem)) {
            uVar.z();
            nx0.v vVar = (nx0.v) beautyItem;
            c10979xd03dfd61.f151116o = vVar;
            c10979xd03dfd61.f151117p = intValue;
            ((nx0.x) uVar.f422765d.get(intValue)).f422791a = true;
            uVar.m8147xed6e4d18(intValue);
            m47342xb3543e45 = c10979xd03dfd61.m47342xb3543e45();
            m47342xb3543e45.m47378x3ae760af(a06.d.b(vVar.f422776e * 100));
            m47342xb3543e452 = c10979xd03dfd61.m47342xb3543e45();
            m47342xb3543e452.setVisibility(0);
        }
        m47340x4905e9fa = c10979xd03dfd61.m47340x4905e9fa();
        dy0.o.b(m47340x4905e9fa, intValue, false, 2, null);
        int i19 = uVar.f422767f;
        uVar.f422767f = intValue;
        if (i19 >= 0 && i19 < uVar.f422765d.size()) {
            uVar.m8147xed6e4d18(i19);
        }
        uVar.m8147xed6e4d18(uVar.f422767f);
        return jz5.f0.f384359a;
    }
}
