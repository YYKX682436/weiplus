package org.p3343x72743996.net.p3358x316220;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "cronet")
/* renamed from: org.chromium.net.impl.CronetUploadDataStream */
/* loaded from: classes16.dex */
public final class C29607x7a6892a8 extends org.p3343x72743996.net.AbstractC29562xf1e0a9e {
    private static final java.lang.String TAG = "CronetUploadDataStream";

    /* renamed from: mByteBuffer */
    private java.nio.ByteBuffer f74621xdcc5f3b5;

    /* renamed from: mByteBufferLimit */
    private long f74622x39377106;

    /* renamed from: mDataProvider */
    private final org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UploadDataProviderWrapper f74623xabd528c8;

    /* renamed from: mDestroyAdapterPostponed */
    private boolean f74624xe55a54ec;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f74625x9ec3a060;

    /* renamed from: mLength */
    private long f74627xd7a61b3;

    /* renamed from: mOnDestroyedCallbackForTesting */
    private java.lang.Runnable f74629x9c642a59;

    /* renamed from: mRemainingLength */
    private long f74631xb441344f;

    /* renamed from: mRequest */
    private final org.p3343x72743996.net.p3358x316220.C29609x93734ddd f74632xdf67a562;

    /* renamed from: mUploadDataStreamAdapter */
    private long f74633x78fa80f7;

    /* renamed from: mReadTask */
    private final java.lang.Runnable f74630xf147efc8 = new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUploadDataStream.1

        /* renamed from: $assertionsDisabled */
        static final /* synthetic */ boolean f74634x7118e671 = false;

        @Override // java.lang.Runnable
        public void run() {
            synchronized (org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.f74628x6243b38) {
                if (org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.f74633x78fa80f7 == 0) {
                    return;
                }
                org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.m154133xe071d469(3);
                if (org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.f74621xdcc5f3b5 == null) {
                    throw new java.lang.IllegalStateException("Unexpected readData call. Buffer is null");
                }
                org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.f74626xb3e9df9b = 0;
                try {
                    org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.m154132x7652a7c6();
                    org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UploadDataProviderWrapper uploadDataProviderWrapper = org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.f74623xabd528c8;
                    org.p3343x72743996.net.p3358x316220.C29607x7a6892a8 c29607x7a6892a8 = org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this;
                    uploadDataProviderWrapper.mo153655x355996(c29607x7a6892a8, c29607x7a6892a8.f74621xdcc5f3b5);
                } catch (java.lang.Exception e17) {
                    org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.m154136xaf8aa769(e17);
                }
            }
        }
    };

    /* renamed from: mLock */
    private final java.lang.Object f74628x6243b38 = new java.lang.Object();

    /* renamed from: mInWhichUserCallback */
    private int f74626xb3e9df9b = 3;

    /* renamed from: org.chromium.net.impl.CronetUploadDataStream$Natives */
    /* loaded from: classes16.dex */
    public interface Natives {
        /* renamed from: attachUploadDataToRequest */
        long mo154145xdf520804(org.p3343x72743996.net.p3358x316220.C29607x7a6892a8 c29607x7a6892a8, long j17, long j18);

        /* renamed from: createAdapterForTesting */
        long mo154146x5a34181a(org.p3343x72743996.net.p3358x316220.C29607x7a6892a8 c29607x7a6892a8);

        /* renamed from: createUploadDataStreamForTesting */
        long mo154147xc9a0562e(org.p3343x72743996.net.p3358x316220.C29607x7a6892a8 c29607x7a6892a8, long j17, long j18);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetUploadDataStreamAdapter")
        /* renamed from: destroy */
        void mo154148x5cd39ffa(long j17);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetUploadDataStreamAdapter")
        /* renamed from: onReadSucceeded */
        void mo154149xf9a6d5cc(long j17, org.p3343x72743996.net.p3358x316220.C29607x7a6892a8 c29607x7a6892a8, int i17, boolean z17);

        @org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29388xc13ad346(m152784x6ac9171 = "CronetUploadDataStreamAdapter")
        /* renamed from: onRewindSucceeded */
        void mo154150xe8a7e807(long j17, org.p3343x72743996.net.p3358x316220.C29607x7a6892a8 c29607x7a6892a8);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.net.impl.CronetUploadDataStream$UserCallback */
    /* loaded from: classes6.dex */
    public @interface UserCallback {

        /* renamed from: GET_LENGTH */
        public static final int f74638xf3c4300f = 2;

        /* renamed from: NOT_IN_CALLBACK */
        public static final int f74639x3f94ca93 = 3;

        /* renamed from: READ */
        public static final int f74640x265196 = 0;

        /* renamed from: REWIND */
        public static final int f74641x8fe260bb = 1;
    }

    public C29607x7a6892a8(org.p3343x72743996.net.AbstractC29560x8cb1347c abstractC29560x8cb1347c, java.util.concurrent.Executor executor, org.p3343x72743996.net.p3358x316220.C29609x93734ddd c29609x93734ddd) {
        this.f74625x9ec3a060 = executor;
        this.f74623xabd528c8 = new org.p3343x72743996.net.p3358x316220.C29634x6e3d5de9.UploadDataProviderWrapper(abstractC29560x8cb1347c);
        this.f74632xdf67a562 = c29609x93734ddd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkCallingThread */
    public void m154132x7652a7c6() {
        this.f74632xdf67a562.m154180x7652a7c6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkState */
    public void m154133xe071d469(int i17) {
        if (this.f74626xb3e9df9b == i17) {
            return;
        }
        throw new java.lang.IllegalStateException("Expected " + i17 + ", but was " + this.f74626xb3e9df9b);
    }

    /* renamed from: destroyAdapter */
    private void m154134x8b368df5() {
        synchronized (this.f74628x6243b38) {
            if (this.f74626xb3e9df9b == 0) {
                this.f74624xe55a54ec = true;
                return;
            }
            if (this.f74633x78fa80f7 == 0) {
                return;
            }
            org.p3343x72743996.net.p3358x316220.C29608xcf43afdd.get().mo154148x5cd39ffa(this.f74633x78fa80f7);
            this.f74633x78fa80f7 = 0L;
            java.lang.Runnable runnable = this.f74629x9c642a59;
            if (runnable != null) {
                runnable.run();
            }
            m154141x21a23c93(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUploadDataStream.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.m154132x7652a7c6();
                        org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.f74623xabd528c8.close();
                    } catch (java.lang.Exception e17) {
                        org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.TAG, "Exception thrown when closing", (java.lang.Throwable) e17);
                    }
                }
            });
        }
    }

    /* renamed from: destroyAdapterIfPostponed */
    private void m154135x665ef4bc() {
        synchronized (this.f74628x6243b38) {
            if (this.f74626xb3e9df9b == 0) {
                throw new java.lang.IllegalStateException("Method should not be called when read has not completed.");
            }
            if (this.f74624xe55a54ec) {
                m154134x8b368df5();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onError */
    public void m154136xaf8aa769(java.lang.Throwable th6) {
        boolean z17;
        synchronized (this.f74628x6243b38) {
            int i17 = this.f74626xb3e9df9b;
            if (i17 == 3) {
                throw new java.lang.IllegalStateException("There is no read or rewind or length check in progress.", th6);
            }
            z17 = i17 == 2;
            this.f74626xb3e9df9b = 3;
            this.f74621xdcc5f3b5 = null;
            m154135x665ef4bc();
        }
        if (z17) {
            try {
                this.f74623xabd528c8.close();
            } catch (java.lang.Exception e17) {
                org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Failure closing data provider", (java.lang.Throwable) e17);
            }
        }
        this.f74632xdf67a562.m154182x299e636f(th6);
    }

    /* renamed from: attachNativeAdapterToRequest */
    public void m154137xe5cbffe1(long j17) {
        synchronized (this.f74628x6243b38) {
            this.f74633x78fa80f7 = org.p3343x72743996.net.p3358x316220.C29608xcf43afdd.get().mo154145xdf520804(this, j17, this.f74627xd7a61b3);
        }
    }

    /* renamed from: createUploadDataStreamForTesting */
    public long m154138xc9a0562e() {
        long mo154147xc9a0562e;
        synchronized (this.f74628x6243b38) {
            this.f74633x78fa80f7 = org.p3343x72743996.net.p3358x316220.C29608xcf43afdd.get().mo154146x5a34181a(this);
            long mo153654x23255ddc = this.f74623xabd528c8.mo153654x23255ddc();
            this.f74627xd7a61b3 = mo153654x23255ddc;
            this.f74631xb441344f = mo153654x23255ddc;
            mo154147xc9a0562e = org.p3343x72743996.net.p3358x316220.C29608xcf43afdd.get().mo154147xc9a0562e(this, this.f74627xd7a61b3, this.f74633x78fa80f7);
        }
        return mo154147xc9a0562e;
    }

    /* renamed from: initializeWithRequest */
    public void m154139xc0209139() {
        synchronized (this.f74628x6243b38) {
            this.f74626xb3e9df9b = 2;
        }
        try {
            this.f74632xdf67a562.m154180x7652a7c6();
            long mo153654x23255ddc = this.f74623xabd528c8.mo153654x23255ddc();
            this.f74627xd7a61b3 = mo153654x23255ddc;
            this.f74631xb441344f = mo153654x23255ddc;
        } catch (java.lang.Throwable th6) {
            m154136xaf8aa769(th6);
        }
        synchronized (this.f74628x6243b38) {
            this.f74626xb3e9df9b = 3;
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29562xf1e0a9e
    /* renamed from: onReadError */
    public void mo153662xba5d52f3(java.lang.Exception exc) {
        synchronized (this.f74628x6243b38) {
            m154133xe071d469(0);
            m154136xaf8aa769(exc);
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29562xf1e0a9e
    /* renamed from: onReadSucceeded */
    public void mo153663xf9a6d5cc(boolean z17) {
        synchronized (this.f74628x6243b38) {
            m154133xe071d469(0);
            if (this.f74622x39377106 != this.f74621xdcc5f3b5.limit()) {
                throw new java.lang.IllegalStateException("ByteBuffer limit changed");
            }
            if (z17 && this.f74627xd7a61b3 >= 0) {
                throw new java.lang.IllegalArgumentException("Non-chunked upload can't have last chunk");
            }
            int position = this.f74621xdcc5f3b5.position();
            long j17 = this.f74631xb441344f - position;
            this.f74631xb441344f = j17;
            if (j17 < 0 && this.f74627xd7a61b3 >= 0) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Read upload data length %d exceeds expected length %d", java.lang.Long.valueOf(this.f74627xd7a61b3 - this.f74631xb441344f), java.lang.Long.valueOf(this.f74627xd7a61b3)));
            }
            this.f74621xdcc5f3b5 = null;
            this.f74626xb3e9df9b = 3;
            m154135x665ef4bc();
            if (this.f74633x78fa80f7 == 0) {
                return;
            }
            org.p3343x72743996.net.p3358x316220.C29608xcf43afdd.get().mo154149xf9a6d5cc(this.f74633x78fa80f7, this, position, z17);
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29562xf1e0a9e
    /* renamed from: onRewindError */
    public void mo153664xbc1ebaae(java.lang.Exception exc) {
        synchronized (this.f74628x6243b38) {
            m154133xe071d469(1);
            m154136xaf8aa769(exc);
        }
    }

    @Override // org.p3343x72743996.net.AbstractC29562xf1e0a9e
    /* renamed from: onRewindSucceeded */
    public void mo153665xe8a7e807() {
        synchronized (this.f74628x6243b38) {
            m154133xe071d469(1);
            this.f74626xb3e9df9b = 3;
            this.f74631xb441344f = this.f74627xd7a61b3;
            if (this.f74633x78fa80f7 == 0) {
                return;
            }
            org.p3343x72743996.net.p3358x316220.C29608xcf43afdd.get().mo154150xe8a7e807(this.f74633x78fa80f7, this);
        }
    }

    /* renamed from: onUploadDataStreamDestroyed */
    public void m154140xe3f8408f() {
        m154134x8b368df5();
    }

    /* renamed from: postTaskToExecutor */
    public void m154141x21a23c93(java.lang.Runnable runnable) {
        try {
            this.f74625x9ec3a060.execute(runnable);
        } catch (java.lang.Throwable th6) {
            this.f74632xdf67a562.m154182x299e636f(th6);
        }
    }

    /* renamed from: readData */
    public void m154142xcc430260(java.nio.ByteBuffer byteBuffer) {
        this.f74621xdcc5f3b5 = byteBuffer;
        this.f74622x39377106 = byteBuffer.limit();
        m154141x21a23c93(this.f74630xf147efc8);
    }

    /* renamed from: rewind */
    public void m154143xc84f6cbb() {
        m154141x21a23c93(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUploadDataStream.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.f74628x6243b38) {
                    if (org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.f74633x78fa80f7 == 0) {
                        return;
                    }
                    org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.m154133xe071d469(3);
                    org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.f74626xb3e9df9b = 1;
                    try {
                        org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.m154132x7652a7c6();
                        org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.f74623xabd528c8.mo153656xc84f6cbb(org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this);
                    } catch (java.lang.Exception e17) {
                        org.p3343x72743996.net.p3358x316220.C29607x7a6892a8.this.m154136xaf8aa769(e17);
                    }
                }
            }
        });
    }

    /* renamed from: setOnDestroyedCallbackForTesting */
    public void m154144xea08e84(java.lang.Runnable runnable) {
        this.f74629x9c642a59 = runnable;
    }
}
