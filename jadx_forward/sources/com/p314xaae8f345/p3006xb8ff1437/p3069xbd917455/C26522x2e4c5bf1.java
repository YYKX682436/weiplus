package com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455;

/* renamed from: com.tencent.thumbplayer.tplayer.TPPlayerProxy */
/* loaded from: classes13.dex */
public class C26522x2e4c5bf1 implements java.lang.reflect.InvocationHandler {

    /* renamed from: mPlayer */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d f54386x14aac1ae;

    /* renamed from: mSwitch */
    private com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26583x8b41067a f54387x1a67de01;

    public C26522x2e4c5bf1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d c26520x2c78c47d) {
        this.f54386x14aac1ae = c26520x2c78c47d;
        this.f54387x1a67de01 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26583x8b41067a(c26520x2c78c47d.m103615xb5887064(), this.f54386x14aac1ae.m103614x23b2dd47(), this.f54386x14aac1ae);
    }

    /* renamed from: beforeSetDataSource */
    private java.lang.Object[] m103635xf2c7b928(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[0];
        if (obj != null && (obj instanceof android.os.ParcelFileDescriptor)) {
            try {
                android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) obj;
                objArr[0] = android.os.ParcelFileDescriptor.fromFd(parcelFileDescriptor.detachFd());
                parcelFileDescriptor.close();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(this.f54386x14aac1ae.m103615xb5887064(), "setDataSource, fromFd has exception:" + e17.toString());
            }
        } else if (obj != null && (obj instanceof android.content.res.AssetFileDescriptor)) {
            try {
                android.content.res.AssetFileDescriptor assetFileDescriptor = (android.content.res.AssetFileDescriptor) obj;
                objArr[0] = new android.content.res.AssetFileDescriptor(android.os.ParcelFileDescriptor.fromFd(assetFileDescriptor.getParcelFileDescriptor().detachFd()), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                assetFileDescriptor.close();
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(this.f54386x14aac1ae.m103615xb5887064(), "setDataSource, fromFd has exception:" + e18.toString());
            }
        }
        return objArr;
    }

    /* renamed from: dealThreadSwitch */
    private java.lang.Object m103636xaa64906a(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String name = method.getName();
        if (name.equals("setDataSource")) {
            objArr = m103635xf2c7b928(objArr);
        }
        if (method.getReturnType().getName().equals("void")) {
            this.f54387x1a67de01.m104430xaa64906a(name, objArr);
            return null;
        }
        java.lang.Object m104431x3eeca88d = this.f54387x1a67de01.m104431x3eeca88d(name, objArr);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f54386x14aac1ae.m103615xb5887064(), "dealThreadSwitch: " + name + ", var count:" + m103637x2f4e379e(objArr) + ", result:" + m104431x3eeca88d);
        return m104431x3eeca88d;
    }

    /* renamed from: getVarCount */
    private int m103637x2f4e379e(java.lang.Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    /* renamed from: isNeedSwitchThread */
    private boolean m103638xa6c1e35e(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        return com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.m104392x24dcf3d7(this.f54386x14aac1ae.getClass(), method.getName(), objArr) != null;
    }

    /* renamed from: getProxyInstance */
    public java.lang.Object m103639xceae316d() {
        return java.lang.reflect.Proxy.newProxyInstance(this.f54386x14aac1ae.getClass().getClassLoader(), this.f54386x14aac1ae.getClass().getInterfaces(), this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        return !m103638xa6c1e35e(method, objArr) ? method.invoke(this.f54386x14aac1ae, objArr) : m103636xaa64906a(method, objArr);
    }
}
