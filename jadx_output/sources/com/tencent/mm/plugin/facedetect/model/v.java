package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes14.dex */
public class v {

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.facedetect.model.v f100037b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f100038c = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f100039a = null;

    public static final com.tencent.mm.plugin.facedetect.model.v b() {
        com.tencent.mm.plugin.facedetect.model.v vVar;
        if (f100037b != null) {
            return f100037b;
        }
        synchronized (f100038c) {
            if (f100037b == null) {
                f100037b = new com.tencent.mm.plugin.facedetect.model.v();
            }
            vVar = f100037b;
        }
        return vVar;
    }

    public synchronized void a(com.tencent.mm.plugin.facedetect.model.u uVar) {
        if (uVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceCameraDataCallbackHolder", "hy: invalid callbacker");
            return;
        }
        synchronized (f100038c) {
            if (this.f100039a == null) {
                this.f100039a = java.util.Collections.synchronizedList(new java.util.ArrayList(5));
            }
            this.f100039a.add(new com.tencent.mm.plugin.facedetect.model.t(this, uVar));
        }
    }

    public void c(byte[] bArr) {
        synchronized (f100038c) {
            java.util.List list = this.f100039a;
            if (list != null && list.size() != 0) {
                if (bArr != null && bArr.length != 0) {
                    for (com.tencent.mm.plugin.facedetect.model.t tVar : this.f100039a) {
                        int length = bArr.length;
                        byte[] bArr2 = (byte[]) tVar.f100035a.b().m(java.lang.Integer.valueOf(length));
                        tVar.f100036b = bArr2;
                        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
                        tVar.f100035a.a(tVar.f100036b);
                    }
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.FaceCameraDataCallbackHolder", "hy: null camera data got");
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceCameraDataCallbackHolder", "hy: nothing's listening to preview data");
        }
    }

    public void d(com.tencent.mm.plugin.facedetect.model.u uVar) {
        synchronized (f100038c) {
            java.util.List list = this.f100039a;
            if (list != null) {
                list.remove(new com.tencent.mm.plugin.facedetect.model.t(this, uVar));
            }
        }
    }
}
