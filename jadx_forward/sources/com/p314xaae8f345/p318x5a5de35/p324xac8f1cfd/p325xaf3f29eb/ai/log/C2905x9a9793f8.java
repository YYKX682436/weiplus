package com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log;

/* renamed from: com.tencent.cloud.component.common.ai.log.AiLogger */
/* loaded from: classes14.dex */
public class C2905x9a9793f8 {

    /* renamed from: config */
    public com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2904xd06a783e f9889xaf3f8342;

    /* renamed from: printer */
    public com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.b f9890xed3dc81a;

    public C2905x9a9793f8(android.content.Context context, com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.C2904xd06a783e c2904xd06a783e) {
        this.f9889xaf3f8342 = c2904xd06a783e;
        this.f9890xed3dc81a = new com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.b(context, c2904xd06a783e);
    }

    /* renamed from: formatString */
    private java.lang.String m21681x72a82ee8(java.lang.String str, java.lang.Object... objArr) {
        if (str != null) {
            return java.lang.String.format(str, objArr);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = objArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 != 0) {
                sb6.append(", ");
            }
            sb6.append(objArr[i17]);
        }
        return sb6.toString();
    }

    /* renamed from: asset */
    public void m21683x58ceaf0(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.b bVar = this.f9890xed3dc81a;
        if (bVar != null) {
            bVar.a(7, str, str2);
        }
    }

    /* renamed from: debug */
    public void m21686x5b09653(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.b bVar = this.f9890xed3dc81a;
        if (bVar != null) {
            bVar.a(3, str, str2);
        }
    }

    /* renamed from: error */
    public void m21689x5c4d208(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.b bVar = this.f9890xed3dc81a;
        if (bVar != null) {
            bVar.a(6, str, str2);
        }
    }

    /* renamed from: info */
    public void m21692x3164ae(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.b bVar = this.f9890xed3dc81a;
        if (bVar != null) {
            bVar.a(4, str, str2);
        }
    }

    /* renamed from: release */
    public void m21694x41012807() {
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.c cVar;
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.b bVar = this.f9890xed3dc81a;
        if (bVar != null && (cVar = bVar.f127416e) != null) {
            cVar.removeMessages(1);
            com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.c cVar2 = bVar.f127416e;
            com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.f fVar = cVar2.f127421d;
            if (fVar != null) {
                fVar.a();
            }
            cVar2.f127421d = null;
            bVar.f127416e = null;
            android.os.HandlerThread handlerThread = bVar.f127417f;
            if (handlerThread != null && handlerThread.isAlive()) {
                bVar.f127417f.quitSafely();
            }
        }
        this.f9890xed3dc81a = null;
    }

    /* renamed from: verbose */
    public void m21696x14ed7982(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.b bVar = this.f9890xed3dc81a;
        if (bVar != null) {
            bVar.a(3, str, str2);
        }
    }

    /* renamed from: warn */
    public void m21699x379286(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.log.b bVar = this.f9890xed3dc81a;
        if (bVar != null) {
            bVar.a(5, str, str2);
        }
    }

    /* renamed from: asset */
    public void m21682x58ceaf0(java.lang.String str) {
        m21683x58ceaf0(this.f9889xaf3f8342.m21650x16b3f58f(), str);
    }

    /* renamed from: debug */
    public void m21685x5b09653(java.lang.String str) {
        m21686x5b09653(this.f9889xaf3f8342.m21650x16b3f58f(), str);
    }

    /* renamed from: error */
    public void m21688x5c4d208(java.lang.String str) {
        m21689x5c4d208(this.f9889xaf3f8342.m21650x16b3f58f(), str);
    }

    /* renamed from: info */
    public void m21691x3164ae(java.lang.String str) {
        m21692x3164ae(this.f9889xaf3f8342.m21650x16b3f58f(), str);
    }

    /* renamed from: verbose */
    public void m21695x14ed7982(java.lang.String str) {
        m21696x14ed7982(this.f9889xaf3f8342.m21650x16b3f58f(), str);
    }

    /* renamed from: warn */
    public void m21698x379286(java.lang.String str) {
        m21699x379286(this.f9889xaf3f8342.m21650x16b3f58f(), str);
    }

    /* renamed from: asset */
    public void m21684x58ceaf0(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m21683x58ceaf0(str, m21681x72a82ee8(str2, objArr));
    }

    /* renamed from: debug */
    public void m21687x5b09653(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m21686x5b09653(str, m21681x72a82ee8(str2, objArr));
    }

    /* renamed from: error */
    public void m21690x5c4d208(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m21689x5c4d208(str, m21681x72a82ee8(str2, objArr));
    }

    /* renamed from: info */
    public void m21693x3164ae(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m21692x3164ae(str, m21681x72a82ee8(str2, objArr));
    }

    /* renamed from: verbose */
    public void m21697x14ed7982(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m21696x14ed7982(str, m21681x72a82ee8(str2, objArr));
    }

    /* renamed from: warn */
    public void m21700x379286(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m21699x379286(str, m21681x72a82ee8(str2, objArr));
    }
}
