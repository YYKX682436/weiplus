package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.KeyEmbedderResponder */
/* loaded from: classes15.dex */
public class C28560xeb192bcb implements io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder {
    private static final java.lang.String TAG = "KeyEmbedderResponder";

    /* renamed from: messenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f70702xaa66bb13;

    /* renamed from: pressingRecords */
    private final java.util.HashMap<java.lang.Long, java.lang.Long> f70703xacdd4883 = new java.util.HashMap<>();

    /* renamed from: togglingGoals */
    private final java.util.HashMap<java.lang.Long, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.TogglingGoal> f70704x31fd632f = new java.util.HashMap<>();

    /* renamed from: characterCombiner */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.CharacterCombiner f70701x8d9f915c = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.CharacterCombiner();

    /* renamed from: io.flutter.embedding.android.KeyEmbedderResponder$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$io$flutter$embedding$android$KeyData$Type */
        static final /* synthetic */ int[] f70705xdebea3bd;

        static {
            int[] iArr = new int[io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.Type.m137312xcee59d22().length];
            f70705xdebea3bd = iArr;
            try {
                iArr[io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.Type.kDown.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f70705xdebea3bd[io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.Type.kUp.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f70705xdebea3bd[io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.Type.kRepeat.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public C28560xeb192bcb(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
        this.f70702xaa66bb13 = interfaceC28679x1b8c77f2;
        for (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.TogglingGoal togglingGoal : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.m137337xef5d1f79()) {
            this.f70704x31fd632f.put(java.lang.Long.valueOf(togglingGoal.f70729x85282196), togglingGoal);
        }
    }

    /* renamed from: getEventType */
    private static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.Type m137314x14d0a3e(android.view.KeyEvent keyEvent) {
        boolean z17 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z17 ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.Type.kRepeat : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.Type.kDown;
        }
        if (action == 1) {
            return io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.Type.kUp;
        }
        throw new java.lang.AssertionError("Unexpected event type");
    }

    /* renamed from: getLogicalKey */
    private java.lang.Long m137315x7368d98c(android.view.KeyEvent keyEvent) {
        java.lang.Long l17 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70719xf2b4e582.get(java.lang.Long.valueOf(keyEvent.getKeyCode()));
        return l17 != null ? l17 : java.lang.Long.valueOf(m137318xb8d4cb66(keyEvent.getKeyCode(), io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70716x7e9c6d38));
    }

    /* renamed from: getPhysicalKey */
    private java.lang.Long m137316x5b2148d2(android.view.KeyEvent keyEvent) {
        long scanCode = keyEvent.getScanCode();
        if (scanCode == 0) {
            return java.lang.Long.valueOf(m137318xb8d4cb66(keyEvent.getKeyCode(), io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70716x7e9c6d38));
        }
        java.lang.Long l17 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70721x15ec621c.get(java.lang.Long.valueOf(scanCode));
        return l17 != null ? l17 : java.lang.Long.valueOf(m137318xb8d4cb66(keyEvent.getScanCode(), io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70716x7e9c6d38));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145 A[LOOP:2: B:61:0x013f->B:63:0x0145, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a  */
    /* renamed from: handleEventImpl */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m137317x3e9f8a92(android.view.KeyEvent r18, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder.OnKeyEventHandledCallback r19) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28560xeb192bcb.m137317x3e9f8a92(android.view.KeyEvent, io.flutter.embedding.android.KeyboardManager$Responder$OnKeyEventHandledCallback):boolean");
    }

    /* renamed from: keyOfPlane */
    private static long m137318xb8d4cb66(long j17, long j18) {
        return (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) | j18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sendKeyEvent$2 */
    public static /* synthetic */ void m137319xc6d5b16e(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback, java.nio.ByteBuffer byteBuffer) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                bool = java.lang.Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            io.p3284xd2ae381c.Log.w(TAG, "A null reply was received when sending a key event to the framework.");
        }
        onKeyEventHandledCallback.mo137335x7b44e762(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$synchronizePressingKey$0 */
    public /* synthetic */ void m137320x995cf879(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.KeyPair keyPair, long j17, android.view.KeyEvent keyEvent) {
        m137323x12417c90(false, java.lang.Long.valueOf(keyPair.f70724x85282196), java.lang.Long.valueOf(j17), keyEvent.getEventTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$synchronizePressingKey$1 */
    public /* synthetic */ void m137321x995cf87a(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.KeyPair keyPair, long j17, android.view.KeyEvent keyEvent) {
        m137323x12417c90(false, java.lang.Long.valueOf(keyPair.f70724x85282196), java.lang.Long.valueOf(j17), keyEvent.getEventTime());
    }

    /* renamed from: sendKeyEvent */
    private void m137322x359d3323(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289 c28559x32965289, final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        this.f70702xaa66bb13.mo126982x35cf88(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.f70681x56d708e3, c28559x32965289.m137301xb99796b0(), onKeyEventHandledCallback == null ? null : new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply() { // from class: io.flutter.embedding.android.KeyEmbedderResponder$$a
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply
            /* renamed from: reply */
            public final void mo137328x67612ea(java.nio.ByteBuffer byteBuffer) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28560xeb192bcb.m137319xc6d5b16e(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder.OnKeyEventHandledCallback.this, byteBuffer);
            }
        });
    }

    /* renamed from: synthesizeEvent */
    private void m137323x12417c90(boolean z17, java.lang.Long l17, java.lang.Long l18, long j17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289 c28559x32965289 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289();
        c28559x32965289.f70688x3492916 = j17;
        c28559x32965289.f70689x368f3a = z17 ? io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.Type.kDown : io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.Type.kUp;
        c28559x32965289.f70685x85282196 = l17.longValue();
        c28559x32965289.f70686x814b0208 = l18.longValue();
        c28559x32965289.f70683x5d3bbb29 = null;
        c28559x32965289.f70687x514a757a = true;
        c28559x32965289.f70684x2e9006b0 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28559x32965289.DeviceType.kKeyboard;
        if (l18.longValue() != 0 && l17.longValue() != 0) {
            if (!z17) {
                l17 = null;
            }
            m137327xe415d0c9(l18, l17);
        }
        m137322x359d3323(c28559x32965289, null);
    }

    /* renamed from: getPressedState */
    public java.util.Map<java.lang.Long, java.lang.Long> m137324x40a30005() {
        return java.util.Collections.unmodifiableMap(this.f70703xacdd4883);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder
    /* renamed from: handleEvent */
    public void mo137299x5797ad52(android.view.KeyEvent keyEvent, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        if (m137317x3e9f8a92(keyEvent, onKeyEventHandledCallback)) {
            return;
        }
        m137323x12417c90(true, 0L, 0L, 0L);
        onKeyEventHandledCallback.mo137335x7b44e762(true);
    }

    /* renamed from: synchronizePressingKey */
    public void m137325xf1e621b0(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.PressingGoal pressingGoal, boolean z17, long j17, final long j18, final android.view.KeyEvent keyEvent, java.util.ArrayList<java.lang.Runnable> arrayList) {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.KeyPair[] keyPairArr = pressingGoal.f70726x322df4;
        boolean[] zArr = new boolean[keyPairArr.length];
        java.lang.Boolean[] boolArr = new java.lang.Boolean[keyPairArr.length];
        int i17 = 0;
        boolean z18 = false;
        while (true) {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.KeyPair[] keyPairArr2 = pressingGoal.f70726x322df4;
            boolean z19 = true;
            if (i17 >= keyPairArr2.length) {
                break;
            }
            final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.KeyPair keyPair = keyPairArr2[i17];
            boolean containsKey = this.f70703xacdd4883.containsKey(java.lang.Long.valueOf(keyPair.f70725x814b0208));
            zArr[i17] = containsKey;
            if (keyPair.f70724x85282196 == j17) {
                int i18 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28560xeb192bcb.AnonymousClass1.f70705xdebea3bd[m137314x14d0a3e(keyEvent).ordinal()];
                if (i18 != 1) {
                    if (i18 == 2) {
                        boolArr[i17] = java.lang.Boolean.valueOf(zArr[i17]);
                    } else if (i18 == 3) {
                        if (!z17) {
                            arrayList.add(new java.lang.Runnable() { // from class: io.flutter.embedding.android.KeyEmbedderResponder$$c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28560xeb192bcb.this.m137321x995cf87a(keyPair, j18, keyEvent);
                                }
                            });
                        }
                        boolArr[i17] = java.lang.Boolean.valueOf(zArr[i17]);
                    }
                    i17++;
                } else {
                    boolArr[i17] = java.lang.Boolean.FALSE;
                    if (!z17) {
                        arrayList.add(new java.lang.Runnable() { // from class: io.flutter.embedding.android.KeyEmbedderResponder$$b
                            @Override // java.lang.Runnable
                            public final void run() {
                                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28560xeb192bcb.this.m137320x995cf879(keyPair, j18, keyEvent);
                            }
                        });
                    }
                }
            } else if (!z18 && !containsKey) {
                z19 = false;
            }
            z18 = z19;
            i17++;
        }
        if (z17) {
            for (int i19 = 0; i19 < pressingGoal.f70726x322df4.length; i19++) {
                if (boolArr[i19] == null) {
                    if (z18) {
                        boolArr[i19] = java.lang.Boolean.valueOf(zArr[i19]);
                    } else {
                        boolArr[i19] = java.lang.Boolean.TRUE;
                        z18 = true;
                    }
                }
            }
            if (!z18) {
                boolArr[0] = java.lang.Boolean.TRUE;
            }
        } else {
            for (int i27 = 0; i27 < pressingGoal.f70726x322df4.length; i27++) {
                if (boolArr[i27] == null) {
                    boolArr[i27] = java.lang.Boolean.FALSE;
                }
            }
        }
        for (int i28 = 0; i28 < pressingGoal.f70726x322df4.length; i28++) {
            if (zArr[i28] != boolArr[i28].booleanValue()) {
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.KeyPair keyPair2 = pressingGoal.f70726x322df4[i28];
                m137323x12417c90(boolArr[i28].booleanValue(), java.lang.Long.valueOf(keyPair2.f70724x85282196), java.lang.Long.valueOf(keyPair2.f70725x814b0208), keyEvent.getEventTime());
            }
        }
    }

    /* renamed from: synchronizeTogglingKey */
    public void m137326x404bbe1e(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.TogglingGoal togglingGoal, boolean z17, long j17, android.view.KeyEvent keyEvent) {
        if (togglingGoal.f70729x85282196 == j17 || togglingGoal.f70728xa00f8b41 == z17) {
            return;
        }
        boolean z18 = !this.f70703xacdd4883.containsKey(java.lang.Long.valueOf(togglingGoal.f70731x814b0208));
        if (z18) {
            togglingGoal.f70728xa00f8b41 = !togglingGoal.f70728xa00f8b41;
        }
        m137323x12417c90(z18, java.lang.Long.valueOf(togglingGoal.f70729x85282196), java.lang.Long.valueOf(togglingGoal.f70731x814b0208), keyEvent.getEventTime());
        if (!z18) {
            togglingGoal.f70728xa00f8b41 = !togglingGoal.f70728xa00f8b41;
        }
        m137323x12417c90(!z18, java.lang.Long.valueOf(togglingGoal.f70729x85282196), java.lang.Long.valueOf(togglingGoal.f70731x814b0208), keyEvent.getEventTime());
    }

    /* renamed from: updatePressingState */
    public void m137327xe415d0c9(java.lang.Long l17, java.lang.Long l18) {
        if (l18 != null) {
            if (this.f70703xacdd4883.put(l17, l18) != null) {
                throw new java.lang.AssertionError("The key was not empty");
            }
        } else if (this.f70703xacdd4883.remove(l17) == null) {
            throw new java.lang.AssertionError("The key was empty");
        }
    }
}
