package dv3;

/* loaded from: classes5.dex */
public abstract class c extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf {
    public final java.util.ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f325529J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(in5.s itemConvertFactory, java.util.ArrayList data) {
        super(itemConvertFactory, data, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemConvertFactory, "itemConvertFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.I = data;
        this.f325529J = "";
    }

    public static void F0(dv3.c cVar, java.util.List audios, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addAudioList");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        cVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audios, "audios");
        java.util.ArrayList arrayList = cVar.I;
        int size = arrayList.size();
        arrayList.removeIf(dv3.a.f325527a);
        int size2 = arrayList.size();
        java.util.List J0 = cVar.J0(audios);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.N0(), "addAudioList " + J0.size());
        if (size == size2) {
            arrayList.addAll(J0);
            if (z17) {
                cVar.m8153xd399a4d9(size, J0.size());
                return;
            }
            return;
        }
        arrayList.addAll(J0);
        if (z17) {
            cVar.m8147xed6e4d18(size2);
            cVar.m8153xd399a4d9(size, J0.size() - 1);
        }
    }

    public static /* synthetic */ void H0(dv3.c cVar, java.util.List list, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addAudioToListTop");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        cVar.G0(list, z17);
    }

    public final void G0(java.util.List audios, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audios, "audios");
        if (audios.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(N0(), "addAudioToListTop: " + audios.size());
        java.util.List J0 = J0(audios);
        this.I.addAll(0, J0);
        if (z17) {
            m8153xd399a4d9(0, J0.size());
        }
    }

    public final void I0() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325529J, "")) {
            return;
        }
        V0(this.f325529J, rv3.y.f481952a);
    }

    public abstract java.util.List J0(java.util.List list);

    public final int K0(java.lang.String musicKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicKey, "musicKey");
        int i17 = 0;
        for (java.lang.Object obj : this.I) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            in5.c cVar = (in5.c) obj;
            if ((cVar instanceof rv3.h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((rv3.h) cVar).f481928d.a(), musicKey)) {
                return i17;
            }
            i17 = i18;
        }
        return -1;
    }

    public final rv3.h L0() {
        java.lang.Object obj;
        java.util.Iterator it = this.I.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            in5.c cVar = (in5.c) obj;
            if ((cVar instanceof rv3.h) && ((rv3.h) cVar).f481928d.B) {
                break;
            }
        }
        if (obj instanceof rv3.h) {
            return (rv3.h) obj;
        }
        return null;
    }

    public final int M0(int i17) {
        if (i17 < 0) {
            return -1;
        }
        java.util.ArrayList arrayList = this.I;
        if (i17 >= arrayList.size()) {
            return -1;
        }
        return ((in5.c) arrayList.get(i17)).h();
    }

    public final java.lang.String N0() {
        return "MicroMsg.AbsMusicPickerDataItemAdapter[" + hashCode() + ']';
    }

    public final boolean O0() {
        java.util.ArrayList arrayList = this.I;
        if ((arrayList instanceof java.util.Collection) && arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((in5.c) it.next()).h() == 2) {
                return true;
            }
        }
        return false;
    }

    public final void P0(int i17) {
        this.K += i17;
    }

    public final in5.c Q0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(N0(), "removeAudio: " + i17);
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.I;
            if (i17 < arrayList.size()) {
                in5.c cVar = (in5.c) arrayList.remove(i17);
                m8155x27702c4(i17);
                return cVar;
            }
        }
        return null;
    }

    public final void R0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.util.Iterator it = this.I.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            in5.c cVar = (in5.c) it.next();
            if ((cVar instanceof rv3.h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((rv3.h) cVar).f481928d.a(), str)) {
                break;
            } else {
                i17++;
            }
        }
        Q0(i17);
    }

    public final void S0(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        N0();
        this.f325529J = value;
    }

    public final void T0(java.util.List audios) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audios, "audios");
        java.util.List J0 = J0(audios);
        java.util.ArrayList arrayList = this.I;
        arrayList.clear();
        arrayList.addAll(J0);
        m8146xced61ae5();
    }

    public final void U0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        int K0 = K0(info.a());
        N0();
        if (K0 >= 0) {
            java.lang.Object obj = this.I.get(K0);
            rv3.h hVar = obj instanceof rv3.h ? (rv3.h) obj : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = hVar != null ? hVar.f481928d : null;
            if (c16997xb0aa383a != null) {
                c16997xb0aa383a.L = z17;
            }
            m8148xed6e4d18(K0, new jz5.l(rv3.f.f481923e, java.lang.Boolean.valueOf(z17)));
        }
    }

    public void V0(java.lang.String musicKey, rv3.v newStatus) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicKey, "musicKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newStatus, "newStatus");
        int K0 = K0(musicKey);
        N0();
        newStatus.toString();
        if (K0 >= 0) {
            java.lang.Object obj = this.I.get(K0);
            rv3.h hVar = obj instanceof rv3.h ? (rv3.h) obj : null;
            if (hVar != null) {
                hVar.f481929e = newStatus;
            }
            m8148xed6e4d18(K0, newStatus);
        }
    }
}
