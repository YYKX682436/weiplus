package pk4;

/* loaded from: classes10.dex */
public final class j implements gk4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c f438029a;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c) {
        this.f438029a = c18689xd498e45c;
    }

    public long a() {
        kk4.v currentPlayer = this.f438029a.getCurrentPlayer();
        if (currentPlayer != null) {
            return currentPlayer.o();
        }
        return -1L;
    }
}
