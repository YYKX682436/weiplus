package er4;

/* loaded from: classes16.dex */
public class j extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public er4.z f337637d;

    /* renamed from: e, reason: collision with root package name */
    public int f337638e;

    /* renamed from: f, reason: collision with root package name */
    public int f337639f;

    /* renamed from: g, reason: collision with root package name */
    public int f337640g;

    /* renamed from: h, reason: collision with root package name */
    public int f337641h;

    /* renamed from: i, reason: collision with root package name */
    public int f337642i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f337643m = new boolean[7];

    static {
        new er4.j();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof er4.j)) {
            return false;
        }
        er4.j jVar = (er4.j) fVar;
        return n51.f.a(this.f337637d, jVar.f337637d) && n51.f.a(java.lang.Integer.valueOf(this.f337638e), java.lang.Integer.valueOf(jVar.f337638e)) && n51.f.a(java.lang.Integer.valueOf(this.f337639f), java.lang.Integer.valueOf(jVar.f337639f)) && n51.f.a(java.lang.Integer.valueOf(this.f337640g), java.lang.Integer.valueOf(jVar.f337640g)) && n51.f.a(java.lang.Integer.valueOf(this.f337641h), java.lang.Integer.valueOf(jVar.f337641h)) && n51.f.a(java.lang.Integer.valueOf(this.f337642i), java.lang.Integer.valueOf(jVar.f337642i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new er4.j();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        er4.z zVar;
        int i18 = 0;
        boolean[] zArr = this.f337643m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            er4.z zVar2 = this.f337637d;
            if (zVar2 != null && zArr[1]) {
                fVar.e(1, zVar2.f337761d);
            }
            if (zArr[3]) {
                fVar.e(3, this.f337638e);
            }
            if (zArr[4]) {
                fVar.e(4, this.f337639f);
            }
            if (zArr[5]) {
                fVar.e(5, this.f337640g);
            }
            if (zArr[6]) {
                fVar.e(6, this.f337641h);
            }
            if (zArr[2]) {
                fVar.e(2, this.f337642i);
            }
            return 0;
        }
        if (i17 == 1) {
            er4.z zVar3 = this.f337637d;
            if (zVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, zVar3.f337761d);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f337638e);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f337639f);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f337640g);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f337641h);
            }
            return zArr[2] ? i18 + b36.f.e(2, this.f337642i) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                switch (aVar2.g(intValue)) {
                    case 1:
                        zVar = er4.z.ACTION_TYPE_INCOMING_SHOW_NOTIFICATION;
                        break;
                    case 2:
                        zVar = er4.z.ACTION_TYPE_INCOMING_SHOW_CALLKIT;
                        break;
                    case 3:
                        zVar = er4.z.ACTION_TYPE_INCOMING_SHOW_CARD;
                        break;
                    case 4:
                        zVar = er4.z.ACTION_TYPE_SHOW_MAIN_TALK_VIEW;
                        break;
                    case 5:
                        zVar = er4.z.ACTION_TYPE_CAMERA_STARTUP_BEGIN;
                        break;
                    case 6:
                        zVar = er4.z.ACTION_TYPE_CAMERA_FIRST_CALLBACK;
                        break;
                    case 7:
                        zVar = er4.z.ACTION_TYPE_SHOW_LOCAL_FIRST_PICTURE;
                        break;
                    case 8:
                        zVar = er4.z.ACTION_TYPE_SHOW_REMOTE_FIRST_PICTURE;
                        break;
                    case 9:
                        zVar = er4.z.ACTION_TYPE_AUDIO_RECORDER_STARTUP_BEGIN;
                        break;
                    case 10:
                        zVar = er4.z.ACTION_TYPE_AUDIO_RECORDER_STARTUP_SUCC;
                        break;
                    case 11:
                        zVar = er4.z.ACTION_TYPE_AUDIO_RECORDER_FIRST_CALLBACK;
                        break;
                    case 12:
                        zVar = er4.z.ACTION_TYPE_AUDIO_PLAYER_STARTUP_BEGIN;
                        break;
                    case 13:
                        zVar = er4.z.ACTION_TYPE_AUDIO_PLAYER_FIRST_CALLBACK;
                        break;
                    case 14:
                        zVar = er4.z.ACTION_TYPE_AUDIO_OCCUPY_BEGIN;
                        break;
                    case 15:
                        zVar = er4.z.ACTION_TYPE_AUDIO_OCCUPY_END;
                        break;
                    default:
                        zVar = null;
                        break;
                }
                this.f337637d = zVar;
                zArr[1] = true;
                return 0;
            case 2:
                this.f337642i = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f337638e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f337639f = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f337640g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f337641h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (er4.j) super.mo11468x92b714fd(bArr);
    }
}
