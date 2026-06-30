package com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0;

/* renamed from: com.tencent.wechat.aff.wenote.ZIDL_jA0YjmIVB */
/* loaded from: classes11.dex */
class C27585x9f40e0ca extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.a {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.b f299205a;

    /* renamed from: ZIDL_BX */
    private native void m117796x1964d19e(long j17, long j18);

    public void Q1(long j17) {
        m117796x1964d19e(this.f60633xf042a733, j17);
    }

    /* renamed from: ZIDL_A */
    public com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 m117797x9db8edf9(byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.b bVar = this.f299205a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((gz4.b) bVar).getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gz4.c.f359296a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.h hVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.h) gz4.c.f359296a.get(str);
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeNoteCppToNativeSingletonImpl", "getWeNoteNativeHelperInstance: failed " + str + ' ');
            hVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.h(new dz4.j0(null));
        }
        return com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119594xe00b261d(hVar);
    }

    /* renamed from: ZIDL_BV */
    public void m117798x1964d19c(long j17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.b bVar = this.f299205a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((gz4.b) bVar).getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gz4.c.f359296a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = gz4.c.f359296a;
        boolean z17 = ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.h) concurrentHashMap2.get(str)) != null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteCppToNativeSingletonImpl", "abandonWeNoteNativeHelperInstance: " + z17 + ", " + str);
        if (z17) {
            concurrentHashMap2.remove(str);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.a aVar = gz4.b.f359295b;
        if (aVar != null) {
            ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.C27585x9f40e0ca) aVar).Q1(j17);
        }
    }

    /* renamed from: ZIDL_C */
    public byte[] m117799x9db8edfb(byte[] bArr, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.b bVar = this.f299205a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((gz4.b) bVar).getClass();
        java.lang.String str3 = "";
        if (!(str.length() == 0)) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            switch (str.hashCode()) {
                case -1943382669:
                    if (str.equals("Fav_Node_WeApp_Title")) {
                        str3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571543id);
                        break;
                    }
                    break;
                case -1700376596:
                    if (str.equals("Fav_Node_Name_CustomerService_ShareCard")) {
                        str3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571979va);
                        break;
                    }
                    break;
                case -1643702965:
                    if (str.equals("WCFinder_Feed_Save_From_Someone")) {
                        str3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pcs, str2);
                        break;
                    }
                    break;
                case -1181036344:
                    if (str.equals("Fav_Node_Name_Not_Support")) {
                        str3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572038wz);
                        break;
                    }
                    break;
                case -1161822380:
                    if (str.equals("Fav_Node_Name_ShareCard")) {
                        str3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571978v9);
                        break;
                    }
                    break;
                case -1115466889:
                    if (str.equals("Fav_Node_Name_Voice")) {
                        str3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572133zm);
                        break;
                    }
                    break;
                case -343653716:
                    if (str.equals("Fav_Node_Name_Record")) {
                        str3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572068xv);
                        break;
                    }
                    break;
                case 102326541:
                    if (str.equals("Fav_Node_Name_Note")) {
                        str3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572039x0);
                        break;
                    }
                    break;
                case 1647537019:
                    if (str.equals("Fav_Node_Video_Title")) {
                        str3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572129zi);
                        break;
                    }
                    break;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        }
        return str3.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.b bVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.b) obj;
        this.f299205a = bVar;
        ((gz4.b) bVar).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteCppToNativeSingletonImpl", "setCallback: " + this);
        gz4.b.f359295b = this;
    }
}
