package ua1;

/* loaded from: classes7.dex */
public class c extends dl3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ua1.f f507467a;

    public c(ua1.f fVar) {
        this.f507467a = fVar;
    }

    @Override // dl3.b
    public void a(final dl3.a aVar, final int i17, final int i18, final int i19, byte[] bArr) {
        if (this.f507467a.a() || this.f507467a.b()) {
            return;
        }
        final byte[] bArr2 = (byte[]) bArr.clone();
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: ua1.c$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i27 = i19;
                byte[] bArr3 = bArr2;
                long j17 = currentTimeMillis;
                ua1.f fVar = ua1.c.this.f507467a;
                java.util.Map map = fVar.f507488b;
                dl3.a aVar2 = aVar;
                ua1.b bVar = (ua1.b) ((java.util.HashMap) map).get(java.lang.Short.valueOf(aVar2.f316802a));
                int i28 = i18;
                if (bVar == null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hilive] AbstractAudioOutputListener onOutput failed, sessionId: ");
                    short s17 = aVar2.f316802a;
                    sb6.append((int) s17);
                    sb6.append(" audioType: ");
                    sb6.append(aVar2.f316803b);
                    sb6.append(" audioId: ");
                    sb6.append(aVar2.f316804c);
                    sb6.append(" format: ");
                    sb6.append(i17);
                    sb6.append(" channel: ");
                    sb6.append(i28);
                    sb6.append(" samplerate: ");
                    sb6.append(i27);
                    sb6.append(" size: ");
                    sb6.append(bArr3.length);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordAudioLogic", sb6.toString());
                    bVar = new ua1.b(s17, false);
                    ((java.util.HashMap) fVar.f507488b).put(java.lang.Short.valueOf(s17), bVar);
                }
                bVar.d((short) i28, i27, bArr3, j17);
            }
        };
        ((ku5.t0) ku5.t0.f394148d).h(runnable, this.f507467a.f507487a);
    }

    @Override // dl3.b
    public void b(final dl3.a aVar, final int i17, final int i18, final int i19, float[] fArr) {
        if (this.f507467a.a() || this.f507467a.b()) {
            return;
        }
        final float[] fArr2 = (float[]) fArr.clone();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: ua1.c$$d
            @Override // java.lang.Runnable
            public final void run() {
                ua1.f fVar = ua1.c.this.f507467a;
                java.util.Map map = fVar.f507488b;
                dl3.a aVar2 = aVar;
                ua1.b bVar = (ua1.b) ((java.util.HashMap) map).get(java.lang.Short.valueOf(aVar2.f316802a));
                int i27 = i18;
                int i28 = i19;
                float[] fArr3 = fArr2;
                if (bVar == null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hilive] AbstractAudioOutputListener onOutput failed, sessionId: ");
                    short s17 = aVar2.f316802a;
                    sb6.append((int) s17);
                    sb6.append(" audioType: ");
                    sb6.append(aVar2.f316803b);
                    sb6.append(" audioId: ");
                    sb6.append(aVar2.f316804c);
                    sb6.append(" format: ");
                    sb6.append(i17);
                    sb6.append(" channel: ");
                    sb6.append(i27);
                    sb6.append(" samplerate: ");
                    sb6.append(i28);
                    sb6.append(" size: ");
                    sb6.append(fArr3.length);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecordAudioLogic", sb6.toString());
                    bVar = new ua1.b(s17, false);
                    ((java.util.HashMap) fVar.f507488b).put(java.lang.Short.valueOf(s17), bVar);
                }
                bVar.e((short) i27, i28, fArr3);
            }
        };
        ((ku5.t0) ku5.t0.f394148d).h(runnable, this.f507467a.f507487a);
    }

    @Override // dl3.b
    public void c(final dl3.a aVar) {
        if (this.f507467a.a() || this.f507467a.b()) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: ua1.c$$b
            @Override // java.lang.Runnable
            public final void run() {
                ua1.f fVar = ua1.c.this.f507467a;
                java.util.Map map = fVar.f507488b;
                dl3.a aVar2 = aVar;
                java.lang.Short valueOf = java.lang.Short.valueOf(aVar2.f316802a);
                short s17 = aVar2.f316802a;
                ((java.util.HashMap) map).put(valueOf, new ua1.b(s17, false));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordAudioLogic", "[hilive] onStart sessionId: " + ((int) s17) + " audioType: " + aVar2.f316803b + " audioId: " + aVar2.f316804c + " mStreams: " + ((java.util.HashMap) fVar.f507488b).size());
            }
        }, this.f507467a.f507487a);
    }

    @Override // dl3.b
    public void d(final dl3.a aVar) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: ua1.c$$c
            @Override // java.lang.Runnable
            public final void run() {
                ua1.c cVar = ua1.c.this;
                cVar.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hilive] AbstractAudioOutputListener onStop sessionId: ");
                dl3.a aVar2 = aVar;
                sb6.append((int) aVar2.f316802a);
                sb6.append(" audioType: ");
                int i17 = aVar2.f316803b;
                sb6.append(i17);
                sb6.append(" audioId: ");
                java.lang.String str = aVar2.f316804c;
                sb6.append(str);
                sb6.append(" mStreams: ");
                ua1.f fVar = cVar.f507467a;
                sb6.append(((java.util.HashMap) fVar.f507488b).size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordAudioLogic", sb6.toString());
                java.util.Map map = fVar.f507488b;
                short s17 = aVar2.f316802a;
                java.util.HashMap hashMap = (java.util.HashMap) map;
                ua1.b bVar = (ua1.b) hashMap.remove(java.lang.Short.valueOf(s17));
                if (bVar != null) {
                    bVar.c();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameRecordAudioLogic", "[hilive] AbstractAudioOutputListener onStop, not found sessionId: " + ((int) s17) + " audioType: " + i17 + " audioId: " + str + " mStreams: " + hashMap.size());
            }
        };
        ((ku5.t0) ku5.t0.f394148d).h(runnable, this.f507467a.f507487a);
    }
}
