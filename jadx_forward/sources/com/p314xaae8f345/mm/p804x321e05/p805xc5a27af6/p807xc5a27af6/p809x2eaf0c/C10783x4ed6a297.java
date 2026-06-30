package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p809x2eaf0c;

/* renamed from: com.tencent.mm.kara.feature.feature.comm.DiscoverViewFeatureGroup */
/* loaded from: classes8.dex */
public class C10783x4ed6a297 extends pl0.e {

    /* renamed from: numberOfUnreadAtTab */
    @fl0.a
    public int f29333xbf118cd3 = 0;

    /* renamed from: badgeAtTab */
    @fl0.a
    public int f29328x3ec62c7f = 0;

    /* renamed from: badgeAtMonentCell */
    @fl0.a
    public int f29327xe03cc437 = 0;

    /* renamed from: badgeAtFinderCell */
    @fl0.a
    public int f29325x74420a7e = 0;

    /* renamed from: numberOfUnreadAtMomentCell */
    @fl0.a
    public int f29332xa466f084 = 0;

    /* renamed from: numberOfUnreadAtFinderCell */
    @fl0.a
    public int f29331xa04d63aa = 0;

    /* renamed from: preSubEntrance */
    @fl0.a
    public int[] f29334x45656e73 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: enterProbabilityBaseOnTime */
    public float f29330x65e0959a = 0.0f;

    /* renamed from: enterProbabilityBaseOnSeries */
    public float f29329x6e26c204 = 0.0f;

    /* renamed from: badgeAtLiveCell */
    @fl0.a
    public int f29326x8ae56dc4 = 0;

    @Override // pl0.e, fl0.b
    /* renamed from: build */
    public void mo46315x59bc66e() {
        super.mo46315x59bc66e();
        zs.a aVar = zs.b.f556755a;
        switch (zs.b.f556755a.ordinal()) {
            case 0:
                this.f29334x45656e73[0] = 1;
                break;
            case 1:
                this.f29334x45656e73[1] = 1;
                break;
            case 2:
                this.f29334x45656e73[2] = 1;
                break;
            case 3:
                this.f29334x45656e73[3] = 1;
                break;
            case 4:
                this.f29334x45656e73[4] = 1;
                break;
            case 5:
                this.f29334x45656e73[5] = 1;
                break;
            case 6:
                this.f29334x45656e73[6] = 1;
                break;
            case 7:
                this.f29334x45656e73[7] = 1;
                break;
            case 8:
                this.f29334x45656e73[8] = 1;
                break;
            case 9:
                this.f29334x45656e73[9] = 1;
                break;
            case 10:
                this.f29334x45656e73[10] = 1;
                break;
        }
        this.f29331xa04d63aa = zs.c.f556761f;
        this.f29332xa466f084 = zs.c.f556762g;
        this.f29327xe03cc437 = zs.c.f556757b ? 1 : 0;
        this.f29325x74420a7e = zs.c.f556758c ? 1 : 0;
        this.f29326x8ae56dc4 = zs.c.f556759d ? 1 : 0;
        this.f29328x3ec62c7f = zs.c.f556756a ? 1 : 0;
        this.f29333xbf118cd3 = zs.c.f556760e;
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "discover_view";
    }
}
