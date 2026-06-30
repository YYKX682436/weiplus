package dl3;

/* loaded from: classes13.dex */
public class b0 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 {

    /* renamed from: a, reason: collision with root package name */
    public int f316807a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f316808b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final dl3.a f316809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.d0 f316810d;

    public b0(dl3.d0 d0Var) {
        this.f316810d = d0Var;
        this.f316809c = new dl3.a(2, d0Var.f316813c);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
    /* renamed from: getActualTime */
    public long mo93759xbf6cb171(long j17) {
        return 0L;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
    /* renamed from: isEnabled */
    public boolean mo93761x7d80d2b7() {
        return this.f316810d.f316834x != null;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
    /* renamed from: isTerminal */
    public boolean mo93762x8a4f39c6() {
        return false;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
    /* renamed from: onPcm */
    public boolean mo93763x64f6a7b(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25321xe86c292e c25321xe86c292e2, long j17) {
        dl3.b bVar = this.f316810d.f316834x;
        if (bVar == null) {
            return false;
        }
        bVar.a(this.f316809c, 1, this.f316807a, this.f316808b, c25321xe86c292e.f45535x93fb68);
        return false;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
    /* renamed from: onPlayerReady */
    public long mo93765x3d057be3(int i17, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 c25316x94782396, long j17) {
        this.f316807a = c25316x94782396.m93539xd13e6146();
        this.f316808b = (int) c25316x94782396.m93542xf6c809a0();
        dl3.b bVar = this.f316810d.f316834x;
        if (bVar == null) {
            return 0L;
        }
        bVar.c(this.f316809c);
        return 0L;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
    /* renamed from: onPlayerSeekComplete */
    public void mo93766xfdfcc191(long j17) {
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
    /* renamed from: onPlayerStopped */
    public void mo93767x60dfa40d() {
        dl3.d0 d0Var = this.f316810d;
        dl3.b bVar = d0Var.f316834x;
        if (bVar != null) {
            bVar.d(this.f316809c);
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25323xb43a8cc c25323xb43a8cc = d0Var.f316815e;
        if (c25323xb43a8cc != null) {
            c25323xb43a8cc.mo93649xde51bc86(this);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1
    /* renamed from: onPcm */
    public boolean mo93764x64f6a7b(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25328x90bcc06a c25328x90bcc06a2, long j17) {
        dl3.b bVar = this.f316810d.f316834x;
        if (bVar == null) {
            return false;
        }
        bVar.b(this.f316809c, 3, this.f316807a, this.f316808b, c25328x90bcc06a.f45600x77ac6dbc);
        return false;
    }
}
