package ey2;

/* loaded from: classes9.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.f f338886d;

    public e(ey2.f fVar) {
        this.f338886d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.ObjectOutputStream objectOutputStream;
        java.io.ObjectOutputStream objectOutputStream2;
        ey2.f fVar = this.f338886d;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(((cq.k) i95.n0.c(cq.k.class)).Di(9));
            if (!r6Var.y()) {
                r6Var.l();
            }
            if (!r6Var.m()) {
                r6Var.J();
            }
            str = r6Var.o() + "/18054.ext";
            com.p314xaae8f345.mm.vfs.w6.h(str);
            java.util.Collection values = fVar.f338897h.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.List F0 = kz5.n0.F0(values, new ey2.d());
            arrayList = new java.util.ArrayList(F0.subList(0, java.lang.Math.min(fVar.f338896g, F0.size())));
            byteArrayOutputStream = new java.io.ByteArrayOutputStream(512);
            objectOutputStream = null;
            try {
                try {
                    objectOutputStream2 = new java.io.ObjectOutputStream(byteArrayOutputStream);
                } catch (java.io.IOException e17) {
                    e = e17;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                objectOutputStream2 = objectOutputStream;
            }
        } catch (java.lang.Throwable th7) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
        }
        try {
            objectOutputStream2.writeObject(arrayList);
            try {
                objectOutputStream2.close();
            } catch (java.io.IOException unused) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.18054CacheVM", "[storeCache] ret=" + com.p314xaae8f345.mm.vfs.w6.R(str, byteArrayOutputStream.toByteArray()) + " store cache[" + arrayList.size() + "].");
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.18054CacheVM", m143898xd4a2fc34, "", new java.lang.Object[0]);
            }
        } catch (java.io.IOException e18) {
            e = e18;
            objectOutputStream = objectOutputStream2;
            throw new u46.i(e);
        } catch (java.lang.Throwable th8) {
            th = th8;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (java.io.IOException unused2) {
                }
            }
            throw th;
        }
    }
}
