package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public abstract class ITransmitKvData {

    /* loaded from: classes9.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.ITransmitKvData {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final java.util.concurrent.atomic.AtomicBoolean destroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j17;
        }

        private native void nativeDestroy(long j17);

        private native java.util.ArrayList<java.lang.String> native_allKeys(long j17);

        private native byte[] native_getBinary(long j17, java.lang.String str);

        private native boolean native_getBool(long j17, java.lang.String str);

        private native java.util.ArrayList<java.lang.Boolean> native_getBoolList(long j17, java.lang.String str);

        private native int native_getInt(long j17, java.lang.String str);

        private native java.util.ArrayList<java.lang.Integer> native_getIntList(long j17, java.lang.String str);

        private native com.tencent.kinda.gen.KJSEvent native_getJSEvent(long j17, java.lang.String str);

        private native com.tencent.kinda.gen.ITransmitKvData native_getKvData(long j17, java.lang.String str);

        private native long native_getLong(long j17, java.lang.String str);

        private native java.util.ArrayList<java.lang.Long> native_getLongList(long j17, java.lang.String str);

        private native com.tencent.kinda.gen.UseCaseCallback native_getPlatformCallback(long j17, java.lang.String str);

        private native java.lang.String native_getString(long j17, java.lang.String str);

        private native java.util.ArrayList<java.lang.String> native_getStringList(long j17, java.lang.String str);

        private native void native_modifyBool(long j17, java.lang.String str, boolean z17);

        private native void native_modifyInt(long j17, java.lang.String str, int i17);

        private native void native_putBinary(long j17, java.lang.String str, byte[] bArr);

        private native void native_putBool(long j17, java.lang.String str, boolean z17);

        private native void native_putInt(long j17, java.lang.String str, int i17);

        private native void native_putJSEvent(long j17, java.lang.String str, com.tencent.kinda.gen.KJSEvent kJSEvent);

        private native void native_putKvData(long j17, java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

        private native void native_putListBool(long j17, java.lang.String str, java.util.ArrayList<java.lang.Boolean> arrayList);

        private native void native_putListInt(long j17, java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList);

        private native void native_putListLong(long j17, java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList);

        private native void native_putListString(long j17, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList);

        private native void native_putLong(long j17, java.lang.String str, long j18);

        private native void native_putPlatformCallback(long j17, java.lang.String str, com.tencent.kinda.gen.UseCaseCallback useCaseCallback);

        private native void native_putString(long j17, java.lang.String str, java.lang.String str2);

        private native java.lang.String native_toJson(long j17);

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public java.util.ArrayList<java.lang.String> allKeys() {
            return native_allKeys(this.nativeRef);
        }

        public void destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public byte[] getBinary(java.lang.String str) {
            return native_getBinary(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public boolean getBool(java.lang.String str) {
            return native_getBool(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public java.util.ArrayList<java.lang.Boolean> getBoolList(java.lang.String str) {
            return native_getBoolList(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public int getInt(java.lang.String str) {
            return native_getInt(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public java.util.ArrayList<java.lang.Integer> getIntList(java.lang.String str) {
            return native_getIntList(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public com.tencent.kinda.gen.KJSEvent getJSEvent(java.lang.String str) {
            return native_getJSEvent(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public com.tencent.kinda.gen.ITransmitKvData getKvData(java.lang.String str) {
            return native_getKvData(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public long getLong(java.lang.String str) {
            return native_getLong(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public java.util.ArrayList<java.lang.Long> getLongList(java.lang.String str) {
            return native_getLongList(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public com.tencent.kinda.gen.UseCaseCallback getPlatformCallback(java.lang.String str) {
            return native_getPlatformCallback(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public java.lang.String getString(java.lang.String str) {
            return native_getString(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public java.util.ArrayList<java.lang.String> getStringList(java.lang.String str) {
            return native_getStringList(this.nativeRef, str);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public void modifyBool(java.lang.String str, boolean z17) {
            native_modifyBool(this.nativeRef, str, z17);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public void modifyInt(java.lang.String str, int i17) {
            native_modifyInt(this.nativeRef, str, i17);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public void putBinary(java.lang.String str, byte[] bArr) {
            native_putBinary(this.nativeRef, str, bArr);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public void putBool(java.lang.String str, boolean z17) {
            native_putBool(this.nativeRef, str, z17);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public void putInt(java.lang.String str, int i17) {
            native_putInt(this.nativeRef, str, i17);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public void putJSEvent(java.lang.String str, com.tencent.kinda.gen.KJSEvent kJSEvent) {
            native_putJSEvent(this.nativeRef, str, kJSEvent);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public void putKvData(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            native_putKvData(this.nativeRef, str, iTransmitKvData);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public void putListBool(java.lang.String str, java.util.ArrayList<java.lang.Boolean> arrayList) {
            native_putListBool(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public void putListInt(java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList) {
            native_putListInt(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public void putListLong(java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList) {
            native_putListLong(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public void putListString(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
            native_putListString(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public void putLong(java.lang.String str, long j17) {
            native_putLong(this.nativeRef, str, j17);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public void putPlatformCallback(java.lang.String str, com.tencent.kinda.gen.UseCaseCallback useCaseCallback) {
            native_putPlatformCallback(this.nativeRef, str, useCaseCallback);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public void putString(java.lang.String str, java.lang.String str2) {
            native_putString(this.nativeRef, str, str2);
        }

        @Override // com.tencent.kinda.gen.ITransmitKvData
        public java.lang.String toJson() {
            return native_toJson(this.nativeRef);
        }
    }

    public static native com.tencent.kinda.gen.ITransmitKvData create();

    public abstract java.util.ArrayList<java.lang.String> allKeys();

    public abstract byte[] getBinary(java.lang.String str);

    public abstract boolean getBool(java.lang.String str);

    public abstract java.util.ArrayList<java.lang.Boolean> getBoolList(java.lang.String str);

    public abstract int getInt(java.lang.String str);

    public abstract java.util.ArrayList<java.lang.Integer> getIntList(java.lang.String str);

    public abstract com.tencent.kinda.gen.KJSEvent getJSEvent(java.lang.String str);

    public abstract com.tencent.kinda.gen.ITransmitKvData getKvData(java.lang.String str);

    public abstract long getLong(java.lang.String str);

    public abstract java.util.ArrayList<java.lang.Long> getLongList(java.lang.String str);

    public abstract com.tencent.kinda.gen.UseCaseCallback getPlatformCallback(java.lang.String str);

    public abstract java.lang.String getString(java.lang.String str);

    public abstract java.util.ArrayList<java.lang.String> getStringList(java.lang.String str);

    public abstract void modifyBool(java.lang.String str, boolean z17);

    public abstract void modifyInt(java.lang.String str, int i17);

    public abstract void putBinary(java.lang.String str, byte[] bArr);

    public abstract void putBool(java.lang.String str, boolean z17);

    public abstract void putInt(java.lang.String str, int i17);

    public abstract void putJSEvent(java.lang.String str, com.tencent.kinda.gen.KJSEvent kJSEvent);

    public abstract void putKvData(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    public abstract void putListBool(java.lang.String str, java.util.ArrayList<java.lang.Boolean> arrayList);

    public abstract void putListInt(java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList);

    public abstract void putListLong(java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList);

    public abstract void putListString(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList);

    public abstract void putLong(java.lang.String str, long j17);

    public abstract void putPlatformCallback(java.lang.String str, com.tencent.kinda.gen.UseCaseCallback useCaseCallback);

    public abstract void putString(java.lang.String str, java.lang.String str2);

    public abstract java.lang.String toJson();
}
