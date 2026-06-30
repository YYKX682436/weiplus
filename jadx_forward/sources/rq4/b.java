package rq4;

/* loaded from: classes14.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.hardware.Camera.Parameters parameters, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameters, "parameters");
        rq4.c cVar = qq4.c.f447520a;
        if (cVar == null) {
            return;
        }
        rq4.a aVar = new rq4.a(i17);
        parameters.flatten();
        java.lang.String valueOf = java.lang.String.valueOf(parameters.getPreviewFrameRate());
        java.lang.String[] strArr = aVar.f480468b;
        strArr[0] = valueOf;
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        strArr[1] = "[" + iArr[0] + ',' + iArr[1] + ']';
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(parameters.getFocusMode(), "getFocusMode(...)");
        aVar.f480467a = i17;
        android.hardware.Camera.Size previewSize = parameters.getPreviewSize();
        if (previewSize != null) {
            android.util.Size size = new android.util.Size(previewSize.width, previewSize.height);
            aVar.f480469c = size;
            rq4.c cVar2 = qq4.c.f447520a;
            if (cVar2 != null) {
                java.util.HashMap hashMap = cVar2.f480473b;
                sq4.b bVar = (sq4.b) hashMap.get(cVar2.f480478g);
                if (bVar != null) {
                    bVar.b();
                }
                sq4.b bVar2 = (sq4.b) hashMap.get("CameraPreviewSizeChanged_null*null");
                if (bVar2 != null) {
                    long j17 = bVar2.f492913h;
                    long j18 = cVar2.f480482k;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long currentTimeMillis = j18 + (java.lang.System.currentTimeMillis() - j17);
                    cVar2.f480482k = currentTimeMillis;
                    cVar2.f480482k = currentTimeMillis / 2;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCameraParamsReport", "onCameraPreviewSizeChanged " + size.getWidth() + " * " + size.getHeight() + " cost " + cVar2.f480482k);
                long j19 = gq4.v.wi().f447516q;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CameraPreviewSizeChanged_");
                sb6.append(size.getWidth());
                sb6.append('*');
                sb6.append(size.getHeight());
                java.lang.String sb7 = sb6.toString();
                sq4.b bVar3 = (sq4.b) hashMap.get(sb7);
                if (bVar3 == null) {
                    bVar3 = new sq4.b();
                }
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                bVar3.d(java.lang.System.currentTimeMillis() - j19);
                bVar3.f(sb7);
                bVar3.f492915j = "CameraPreviewSizeChanged";
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(size.getWidth());
                sb8.append('*');
                sb8.append(size.getHeight());
                bVar3.g(sb8.toString());
                hashMap.put(sb7, bVar3);
                cVar2.f480478g = sb7;
            }
        }
        rq4.c cVar3 = qq4.c.f447520a;
        if (cVar3 != null) {
            int i18 = aVar.f480467a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPCameraParamsReport", "onCameraIdPreviewSelect id " + i18);
            java.util.HashMap hashMap2 = cVar3.f480473b;
            sq4.b bVar4 = (sq4.b) hashMap2.get(cVar3.f480477f);
            if (bVar4 != null) {
                bVar4.b();
            }
            long j27 = gq4.v.wi().f447516q;
            java.lang.String str = "CameraIDChanged_" + i18;
            sq4.b bVar5 = (sq4.b) hashMap2.get(str);
            if (bVar5 == null) {
                bVar5 = new sq4.b();
            }
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            bVar5.d(java.lang.System.currentTimeMillis() - j27);
            bVar5.f(str);
            bVar5.f492915j = "CameraIDChanged";
            rq4.a aVar2 = cVar3.f480472a;
            bVar5.f492912g = java.lang.String.valueOf(aVar2 != null ? java.lang.Integer.valueOf(aVar2.f480467a) : null);
            hashMap2.put(str, bVar5);
            cVar3.f480477f = str;
        }
        aVar.f480470d = 1;
        cVar.f480472a = aVar;
    }
}
